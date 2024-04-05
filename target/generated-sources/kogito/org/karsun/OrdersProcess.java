package org.karsun;

import org.karsun.OrdersModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;

@org.springframework.stereotype.Component("orders")
public class OrdersProcess extends org.kie.kogito.process.impl.AbstractProcess<org.karsun.OrdersModel> {

    @org.springframework.beans.factory.annotation.Autowired()
    @org.springframework.beans.factory.annotation.Qualifier("orderItems")
    org.kie.kogito.process.Process<OrderItemsModel> processorderItems;

    @org.springframework.beans.factory.annotation.Autowired()
    public OrdersProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        super(app, java.util.Arrays.asList(), correlations);
        activate();
    }

    public OrdersProcess() {
    }

    @Override()
    public org.karsun.OrdersProcessInstance createInstance(org.karsun.OrdersModel value) {
        return new org.karsun.OrdersProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.karsun.OrdersProcessInstance createInstance(java.lang.String businessKey, org.karsun.OrdersModel value) {
        return new org.karsun.OrdersProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.karsun.OrdersProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.karsun.OrdersModel value) {
        return new org.karsun.OrdersProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.karsun.OrdersModel createModel() {
        return new org.karsun.OrdersModel();
    }

    public org.karsun.OrdersProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.karsun.OrdersModel) value);
    }

    public org.karsun.OrdersProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.karsun.OrdersModel) value);
    }

    public org.karsun.OrdersProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.karsun.OrdersProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.karsun.OrdersProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.karsun.OrdersProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("orders", true);
        factory.variable("order", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.karsun.Order.class), null, "customTags", null);
        factory.name("orders");
        factory.packageName("org.karsun");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Public");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode1 = factory.endNode(1);
        endNode1.name("End");
        endNode1.terminate(false);
        endNode1.metaData("UniqueId", "_37DC5343-3103-4BFB-908E-B9C82844400F");
        endNode1.metaData("x", 783);
        endNode1.metaData("width", 56);
        endNode1.metaData("y", 270);
        endNode1.metaData("height", 56);
        endNode1.done();
        org.jbpm.ruleflow.core.factory.SubProcessNodeFactory<?> subProcessNode2 = factory.subProcessNode(2);
        subProcessNode2.name("Add items");
        subProcessNode2.processId("orderItems");
        subProcessNode2.processName("");
        subProcessNode2.waitForCompletion(true);
        subProcessNode2.independent(false);
        subProcessNode2.subProcessNode(new org.jbpm.workflow.core.node.SubProcessFactory<OrderItemsModel>() {

            public OrderItemsModel bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                org.karsun.OrderItemsModel model = new org.karsun.OrderItemsModel();
                java.util.Map<java.lang.String, java.lang.Object> inputs = org.jbpm.workflow.core.impl.NodeIoHelper.processInputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
                model.update(inputs);
                return model;
            }

            public org.kie.kogito.process.ProcessInstance<OrderItemsModel> createInstance(OrderItemsModel model) {
                return processorderItems.createInstance(model);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, OrderItemsModel model) {
                java.util.Map<java.lang.String, java.lang.Object> outputs = new java.util.HashMap<java.lang.String, java.lang.Object>();
                outputs.put("order", model.getOrder());
                org.jbpm.workflow.core.impl.NodeIoHelper.processOutputs((org.jbpm.workflow.instance.impl.NodeInstanceImpl) kcontext.getNodeInstance(), (java.lang.String name) -> {
                    return outputs.get(name);
                }, (java.lang.String name) -> {
                    return kcontext.getVariable(name);
                });
            }
        });
        subProcessNode2.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("order", "order", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_52B4CE89-CB11-45FA-BF28-0D09CA451575_orderInputX", "order", "org.karsun.Order", null), null, null));
        subProcessNode2.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_52B4CE89-CB11-45FA-BF28-0D09CA451575_orderOutputX", "order", "org.karsun.Order", null)), new org.jbpm.workflow.core.impl.DataDefinition("order", "order", "java.lang.Object", null), null, null));
        subProcessNode2.metaData("UniqueId", "_52B4CE89-CB11-45FA-BF28-0D09CA451575");
        subProcessNode2.metaData("elementname", "Add items");
        subProcessNode2.metaData("x", 515);
        subProcessNode2.metaData("width", 153);
        subProcessNode2.metaData("y", 247);
        subProcessNode2.metaData("height", 101);
        subProcessNode2.done();
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode3 = factory.actionNode(3);
        actionNode3.name("Receive order");
        actionNode3.action(kcontext -> {
            org.karsun.Order order = (org.karsun.Order) kcontext.getVariable("order");
            System.out.println("Your order has been received!");
        });
        actionNode3.metaData("UniqueId", "_B88C93DC-297B-44BF-BFE6-4C2DEFBA3655");
        actionNode3.metaData("elementname", "Receive order");
        actionNode3.metaData("NodeType", "ScriptTask");
        actionNode3.metaData("x", 284);
        actionNode3.metaData("width", 154);
        actionNode3.metaData("y", 247);
        actionNode3.metaData("height", 102);
        actionNode3.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode4 = factory.startNode(4);
        startNode4.name("Start");
        startNode4.interrupting(false);
        startNode4.metaData("UniqueId", "_C5154CF2-2509-4E09-9BE7-2590BA01BD60");
        startNode4.metaData("x", 151);
        startNode4.metaData("width", 56);
        startNode4.metaData("y", 270);
        startNode4.metaData("height", 56);
        startNode4.done();
        factory.connection(2, 1, "_70752109-FFCF-4A72-9878-A20CCA0195A2");
        factory.connection(3, 2, "_6EBBD40C-A851-4A85-A561-FC02D3868796");
        factory.connection(4, 3, "_85FB6951-D3C9-4D6E-AB7F-EC9DF5A9B7B3");
        factory.validate();
        return factory.getProcess();
    }

    protected void registerListeners() {
        services.getSignalManager().addEventListener("orderItems", completionEventListener);
    }
}
