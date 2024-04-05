package org.karsun.P3D;


import static org.karsun.Rulesce63e72f6c7a4e00932dcc8befb4292c.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence3D019FFD5EAF203F10693A1903A7554E implements org.drools.model.functions.Block1<org.drools.ruleunits.api.DataStore<org.karsun.OrderValidResponse>>, org.drools.model.functions.HashedExpression {

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
