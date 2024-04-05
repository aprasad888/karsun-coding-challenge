package org.karsun.P29;


import static org.karsun.Rulesb1d5846bc09e40af8b17356644bb6060.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence29F32F54C07D19DB19A806B93455FD75 implements org.drools.model.functions.Block1<org.drools.ruleunits.api.DataStore<org.karsun.OrderValidResponse>>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "53F76955CE1F6C0D2F87863D604472CC";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(org.drools.ruleunits.api.DataStore<org.karsun.OrderValidResponse> orderValidResponses) throws java.lang.Exception {
        orderValidResponses.add(new OrderValidResponse(false, "Your order could not be validated since you did not provide any customer information. Please resubmit and try again!"));
    }
}
