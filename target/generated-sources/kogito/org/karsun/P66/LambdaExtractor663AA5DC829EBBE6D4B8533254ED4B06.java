package org.karsun.P66;


import static org.karsun.Rulesb1d5846bc09e40af8b17356644bb6060.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor663AA5DC829EBBE6D4B8533254ED4B06 implements org.drools.model.functions.Function1<java.lang.Integer, java.lang.Object>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "73DCE9535B11D6DC6BCBA72D58F8213E";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.Object apply(java.lang.Integer itemQuantity) {
        return itemQuantity;
    }
}
