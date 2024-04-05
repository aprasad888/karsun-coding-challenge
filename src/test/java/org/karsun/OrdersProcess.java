package org.karsun;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.kie.kogito.Model;
import org.kie.kogito.auth.IdentityProviders;
import org.kie.kogito.auth.SecurityPolicy;
import org.karsun.KogitoApplication;
import org.kie.kogito.process.Process;
import org.kie.kogito.process.ProcessInstance;
import org.kie.kogito.process.ProcessInstances;
import org.kie.kogito.process.WorkItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = KogitoApplication.class)

public class OrdersProcess {

    @Autowired
    @Qualifier("demo.orders")
    Process<? extends Model> orderProcess;

    @Autowired
    @Qualifier("demo.orderItems")
    Process<? extends Model> orderItemsProcess;

    private SecurityPolicy policy = SecurityPolicy.of(IdentityProviders.of("john", Collections.singletonList("managers")));

    @Test
    public void testOrderProcess() {
        assertNotNull(orderProcess);

        Model m = orderProcess.createModel();
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("approver", "john");
        // parameters.put("order", new Order("12345", false, 0.0));
        m.fromMap(parameters);

        ProcessInstance<?> processInstance = orderProcess.createInstance(m);
        processInstance.start();

        assertEquals(ProcessInstance.STATE_ACTIVE, processInstance.status());
        Model result = (Model) processInstance.variables();
        assertEquals(2, result.toMap().size());
        assertTrue(((Order) result.toMap().get("order")).getTotal() > 0);

        ProcessInstances<? extends Model> orderItemProcesses = orderItemsProcess.instances();

        // ProcessInstance<?> childProcessInstance = getFirst(orderItemProcesses);

        // List<WorkItem> workItems = childProcessInstance.workItems(policy);
        // assertEquals(1, workItems.size());
        // childProcessInstance.completeWorkItem(workItems.get(0).getId(), null, policy);

        // assertEquals(ProcessInstance.STATE_COMPLETED, childProcessInstance.status());
        // Optional<?> pi = orderProcess.instances().findById(processInstance.id());
        // assertFalse(pi.isPresent());

        // assertEmpty(orderProcess.instances());
        // assertEmpty(orderItemsProcess.instances());
    }

    @Test
    public void testOrderProcessWithError() {
        assertNotNull(orderProcess);

        Model m = orderProcess.createModel();
        Map<String, Object> parameters = new HashMap<>();
        // parameters.put("order", new Order("12345", false, 0.0));
        m.fromMap(parameters);

        ProcessInstance<?> processInstance = orderProcess.createInstance(m);
        processInstance.start();

        assertEquals(ProcessInstance.STATE_ERROR, processInstance.status());
        assertTrue(processInstance.error().isPresent());

        parameters = new HashMap<>();
        parameters.put("approver", "john");
        // parameters.put("order", new Order("12345", false, 0.0));
        m.fromMap(parameters);
        ((ProcessInstance) processInstance).updateVariables(m);

        processInstance.error().get().retrigger();
        assertEquals(ProcessInstance.STATE_ACTIVE, processInstance.status());

        Model result = (Model) processInstance.variables();
        assertEquals(2, result.toMap().size());
        assertTrue(((Order) result.toMap().get("order")).getTotal() > 0);

        ProcessInstances<? extends Model> orderItemProcesses = orderItemsProcess.instances();

        // ProcessInstance<?> childProcessInstance = getFirst(orderItemProcesses);

        // List<WorkItem> workItems = childProcessInstance.workItems(policy);
        // assertEquals(1, workItems.size());

        // childProcessInstance.completeWorkItem(workItems.get(0).getId(), null, policy);

        // assertEquals(ProcessInstance.STATE_COMPLETED, childProcessInstance.status());
        // assertEquals(ProcessInstance.STATE_COMPLETED, processInstance.status());
        // assertEmpty(orderProcess.instances());
        // assertEmpty(orderItemsProcess.instances());
    }
    
}