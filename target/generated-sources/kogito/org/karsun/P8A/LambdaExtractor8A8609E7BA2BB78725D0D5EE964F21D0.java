package org.karsun.P8A;


import static org.karsun.Rulesce63e72f6c7a4e00932dcc8befb4292c.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor8A8609E7BA2BB78725D0D5EE964F21D0 implements org.drools.model.functions.Function1<java.lang.Integer, java.lang.Object>, org.drools.model.functions.HashedExpression {

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
