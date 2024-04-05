package org.karsun.P45;


import static org.karsun.Rulesce63e72f6c7a4e00932dcc8befb4292c.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor454CB0619D598E986ED9389C3E749C3A implements org.drools.model.functions.Function1<java.lang.String, java.lang.Object>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "CA69EA4F85CA6A4820D10BE3F0857E02";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.Object apply(java.lang.String itemName) {
        return itemName;
    }
}
