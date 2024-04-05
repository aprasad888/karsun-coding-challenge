package org.karsun.P0F;


import static org.karsun.Rulesce63e72f6c7a4e00932dcc8befb4292c.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence0F3A1EC418AD9A8F86C2188AF854453E implements org.drools.model.functions.Block1<org.drools.ruleunits.api.DataStore<org.karsun.OrderValidResponse>>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "A4F0477BAE8489431C96FA8401429D32";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.drools.ruleunits.api.DataStore<org.karsun.OrderValidResponse> orderValidResponses) throws java.lang.Exception {
        orderValidResponses.add(new OrderValidResponse(false, "Your order could not be validated since you did not provide a credit card. Please resubmit and try again!"));
    }
}
