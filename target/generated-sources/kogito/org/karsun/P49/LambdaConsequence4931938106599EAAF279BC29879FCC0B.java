package org.karsun.P49;


import static org.karsun.Rulesce63e72f6c7a4e00932dcc8befb4292c.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence4931938106599EAAF279BC29879FCC0B implements org.drools.model.functions.Block1<org.drools.ruleunits.api.DataStore<org.karsun.OrderValidResponse>>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "478B38CAAFC52B7FD42D37F4227C44F2";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.drools.ruleunits.api.DataStore<org.karsun.OrderValidResponse> orderValidResponses) throws java.lang.Exception {
        orderValidResponses.add(new OrderValidResponse(false, "Your order could not be validated since your item has low availability. Please consider reducing your item count or finding another available item!"));
    }
}
