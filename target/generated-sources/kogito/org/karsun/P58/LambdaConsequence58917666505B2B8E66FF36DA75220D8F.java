package org.karsun.P58;


import static org.karsun.Rulesce63e72f6c7a4e00932dcc8befb4292c.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence58917666505B2B8E66FF36DA75220D8F implements org.drools.model.functions.Block4<org.drools.ruleunits.api.DataStore<org.karsun.OrderValidResponse>, org.karsun.Order, org.karsun.Item, org.drools.ruleunits.api.DataStore<org.karsun.Item>>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "97D2ECC8F3823BABDFF979E1BFAECF58";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.drools.ruleunits.api.DataStore<org.karsun.OrderValidResponse> orderValidResponses, org.karsun.Order $order, org.karsun.Item $item, org.drools.ruleunits.api.DataStore<org.karsun.Item> items) throws java.lang.Exception {
        orderValidResponses.add(new OrderValidResponse(true, "Order is valid"));
        items.remove($item);
        items.add(new Item($item.getName(), $item.getQuantity() - $order.getItem().getQuantity()));
    }
}
