package org.karsun.P22;


import static org.karsun.Rulesce63e72f6c7a4e00932dcc8befb4292c.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence22E03C41FA078911F766ED04D892711F implements org.drools.model.functions.Block1<org.drools.ruleunits.api.DataStore<org.karsun.OrderValidResponse>>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "92CB6FEC56729E0E806E972B5688BFBD";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.drools.ruleunits.api.DataStore<org.karsun.OrderValidResponse> orderValidResponses) throws java.lang.Exception {
        orderValidResponses.add(new OrderValidResponse(false, "Your order could not be validated since it is no longer available. Please find another item that is available!"));
    }
}
