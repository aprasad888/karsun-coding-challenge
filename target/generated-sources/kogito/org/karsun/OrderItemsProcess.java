package org.karsun;

import org.karsun.OrderItemsModel;
import org.kie.api.definition.process.Process;
import org.jbpm.ruleflow.core.RuleFlowProcessFactory;
import org.jbpm.process.core.datatype.impl.type.ObjectDataType;
import org.drools.core.util.KieFunctions;
import org.jbpm.process.core.datatype.impl.type.StringDataType;

@org.springframework.stereotype.Component("orderItems")
public class OrderItemsProcess extends org.kie.kogito.process.impl.AbstractProcess<org.karsun.OrderItemsModel> {

    @org.springframework.beans.factory.annotation.Autowired()
    public OrderItemsProcess(org.kie.kogito.app.Application app, org.kie.kogito.correlation.CorrelationService correlations) {
        super(app, java.util.Arrays.asList(), correlations);
        activate();
    }

    public OrderItemsProcess() {
    }

    @Override()
    public org.karsun.OrderItemsProcessInstance createInstance(org.karsun.OrderItemsModel value) {
        return new org.karsun.OrderItemsProcessInstance(this, value, this.createProcessRuntime());
    }

    public org.karsun.OrderItemsProcessInstance createInstance(java.lang.String businessKey, org.karsun.OrderItemsModel value) {
        return new org.karsun.OrderItemsProcessInstance(this, value, businessKey, this.createProcessRuntime());
    }

    public org.karsun.OrderItemsProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.correlation.CompositeCorrelation correlation, org.karsun.OrderItemsModel value) {
        return new org.karsun.OrderItemsProcessInstance(this, value, businessKey, this.createProcessRuntime(), correlation);
    }

    @Override()
    public org.karsun.OrderItemsModel createModel() {
        return new org.karsun.OrderItemsModel();
    }

    public org.karsun.OrderItemsProcessInstance createInstance(org.kie.kogito.Model value) {
        return this.createInstance((org.karsun.OrderItemsModel) value);
    }

    public org.karsun.OrderItemsProcessInstance createInstance(java.lang.String businessKey, org.kie.kogito.Model value) {
        return this.createInstance(businessKey, (org.karsun.OrderItemsModel) value);
    }

    public org.karsun.OrderItemsProcessInstance createInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.karsun.OrderItemsProcessInstance(this, this.createModel(), this.createProcessRuntime(), wpi);
    }

    public org.karsun.OrderItemsProcessInstance createReadOnlyInstance(org.kie.api.runtime.process.WorkflowProcessInstance wpi) {
        return new org.karsun.OrderItemsProcessInstance(this, this.createModel(), wpi);
    }

    protected org.kie.api.definition.process.Process process() {
        RuleFlowProcessFactory factory = RuleFlowProcessFactory.createProcess("orderItems", true);
        factory.variable("order", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.karsun.Order.class), null, "customTags", null);
        factory.variable("item", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(java.lang.String.class), null, "customTags", null);
        factory.variable("orderValidResponse", org.jbpm.process.core.datatype.DataTypeResolver.fromClass(org.karsun.OrderValidResponse.class), null, "customTags", null);
        factory.name("orderItems");
        factory.packageName("org.karsun");
        factory.dynamic(false);
        factory.version("1.0");
        factory.type("BPMN");
        factory.visibility("Private");
        factory.metaData("TargetNamespace", "http://www.omg.org/bpmn20");
        factory.imports("org.karsun.Order");
        factory.imports("org.karsun.OrderValidResponse");
        org.jbpm.ruleflow.core.factory.ActionNodeFactory<?> actionNode1 = factory.actionNode(1);
        actionNode1.name("Order submission response");
        actionNode1.action(kcontext -> {
            org.karsun.Order order = (org.karsun.Order) kcontext.getVariable("order");
            java.lang.String item = (java.lang.String) kcontext.getVariable("item");
            org.karsun.OrderValidResponse orderValidResponse = (org.karsun.OrderValidResponse) kcontext.getVariable("orderValidResponse");
            if (orderValidResponse.getValid()) {
                System.out.println("Congratulations, your order was validated!");
                System.out.println("Here are you order details: ");
                System.out.println("Item ordered: " + order.getItem().getName());
                System.out.println("Amount of item ordered: " + order.getItem().getQuantity());
                Double total = java.lang.Math.round((order.getTotal() + (order.getTotal() * 0.053)) * 100.0) / 100.0;
                System.out.println("Your order total is (including taxes) is: $" + total);
                System.out.println("Your item will be delivered here: " + order.getCustomer().getAddress());
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
            } else {
                System.out.println(orderValidResponse.getMessage());
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------");
            }
        });
        actionNode1.metaData("UniqueId", "_05B06B5F-22D0-44B2-B70A-9D517A034D24");
        actionNode1.metaData("elementname", "Order submission response");
        actionNode1.metaData("NodeType", "ScriptTask");
        actionNode1.metaData("x", 596);
        actionNode1.metaData("width", 154);
        actionNode1.metaData("y", 215);
        actionNode1.metaData("height", 102);
        actionNode1.done();
        org.jbpm.ruleflow.core.factory.EndNodeFactory<?> endNode2 = factory.endNode(2);
        endNode2.name("End");
        endNode2.terminate(false);
        endNode2.metaData("UniqueId", "_490CD313-D5CD-4DD7-BA70-A32CA52628B5");
        endNode2.metaData("x", 844);
        endNode2.metaData("width", 56);
        endNode2.metaData("y", 238);
        endNode2.metaData("height", 56);
        endNode2.done();
        org.jbpm.ruleflow.core.factory.RuleSetNodeFactory<?> ruleSetNode3 = factory.ruleSetNode(3);
        ruleSetNode3.name("Evaluate order");
        ruleSetNode3.ruleUnit("OrderValidationService", new org.jbpm.workflow.core.node.RuleUnitFactory<org.karsun.OrderValidationService>() {

            public org.karsun.OrderValidationService bind(org.kie.api.runtime.process.ProcessContext kcontext) {
                org.karsun.OrderValidationService unit = new org.karsun.OrderValidationService();
                org.karsun.OrderValidResponse orderValidResponse = (org.karsun.OrderValidResponse) (kcontext.getVariable("orderValidResponse"));
                {
                    org.drools.ruleunits.api.DataStore unit_orderValidResponses = unit.getOrderValidResponses();
                    unit_orderValidResponses.subscribe(org.drools.ruleunits.api.DataObserver.ofUpdatable(o -> kcontext.setVariable("orderValidResponse", o)));
                }
                {
                    org.drools.ruleunits.api.DataStore unit_orderValidResponses = unit.getOrderValidResponses();
                    unit_orderValidResponses.add((org.karsun.OrderValidResponse) (kcontext.getVariable("orderValidResponse")));
                }
                org.karsun.Order order = (org.karsun.Order) (kcontext.getVariable("order"));
                {
                    org.drools.ruleunits.api.DataStore unit_orders = unit.getOrders();
                    unit_orders.subscribe(org.drools.ruleunits.api.DataObserver.ofUpdatable(o -> kcontext.setVariable("order", o)));
                }
                {
                    org.drools.ruleunits.api.DataStore unit_orders = unit.getOrders();
                    unit_orders.add((org.karsun.Order) (kcontext.getVariable("order")));
                }
                return unit;
            }

            public org.drools.ruleunits.api.RuleUnit<org.karsun.OrderValidationService> unit() {
                return app.get(org.kie.kogito.rules.RuleUnits.class).create(org.karsun.OrderValidationService.class);
            }

            public void unbind(org.kie.api.runtime.process.ProcessContext kcontext, org.karsun.OrderValidationService unit) {
                org.karsun.OrderValidResponse orderValidResponse = (org.karsun.OrderValidResponse) (kcontext.getVariable("orderValidResponse"));
                {
                    org.drools.ruleunits.api.DataStore unit_orderValidResponses = unit.getOrderValidResponses();
                    unit_orderValidResponses.subscribe(org.drools.ruleunits.api.DataObserver.ofUpdatable(o -> kcontext.setVariable("orderValidResponse", o)));
                }
                org.karsun.Order order = (org.karsun.Order) (kcontext.getVariable("order"));
                {
                    org.drools.ruleunits.api.DataStore unit_orders = unit.getOrders();
                    unit_orders.subscribe(org.drools.ruleunits.api.DataObserver.ofUpdatable(o -> kcontext.setVariable("order", o)));
                }
            }
        });
        ruleSetNode3.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("order", "order", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A34D61AA-DC29-40AA-9966-C244A57E47C4_ordersInputX", "orders", "org.karsun.Order", null), null, null));
        ruleSetNode3.mapDataInputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("orderValidResponse", "orderValidResponse", "java.lang.Object", null)), new org.jbpm.workflow.core.impl.DataDefinition("_A34D61AA-DC29-40AA-9966-C244A57E47C4_orderValidResponsesInputX", "orderValidResponses", "org.karsun.OrderValidResponse", null), null, null));
        ruleSetNode3.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_A34D61AA-DC29-40AA-9966-C244A57E47C4_ordersOutputX", "orders", "org.karsun.Order", null)), new org.jbpm.workflow.core.impl.DataDefinition("order", "order", "java.lang.Object", null), null, null));
        ruleSetNode3.mapDataOutputAssociation(new org.jbpm.workflow.core.impl.DataAssociation(java.util.Arrays.asList(new org.jbpm.workflow.core.impl.DataDefinition("_A34D61AA-DC29-40AA-9966-C244A57E47C4_orderValidResponsesOutputX", "orderValidResponses", "org.karsun.OrderValidResponse", null)), new org.jbpm.workflow.core.impl.DataDefinition("orderValidResponse", "orderValidResponse", "java.lang.Object", null), null, null));
        ruleSetNode3.metaData("UniqueId", "_A34D61AA-DC29-40AA-9966-C244A57E47C4");
        ruleSetNode3.metaData("elementname", "Evaluate order");
        ruleSetNode3.metaData("x", 279);
        ruleSetNode3.metaData("width", 154);
        ruleSetNode3.metaData("y", 215);
        ruleSetNode3.metaData("height", 102);
        ruleSetNode3.done();
        org.jbpm.ruleflow.core.factory.StartNodeFactory<?> startNode4 = factory.startNode(4);
        startNode4.name("Start");
        startNode4.interrupting(false);
        startNode4.metaData("UniqueId", "_0C86416A-028C-4DCA-9B28-70E865E205E4");
        startNode4.metaData("x", 126);
        startNode4.metaData("width", 56);
        startNode4.metaData("y", 238);
        startNode4.metaData("height", 56);
        startNode4.done();
        factory.connection(3, 1, "_90CBE94A-E0F4-42A5-AF18-6FB2814682E5");
        factory.connection(1, 2, "_D587D9F0-2314-4004-BAA9-420BEC3454D7");
        factory.connection(4, 3, "_F29F8606-55B9-4B3F-ADEA-CB60A5186C6C");
        factory.validate();
        return factory.getProcess();
    }
}
