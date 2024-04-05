package org.karsun.P14;


import static org.karsun.Rulesb1d5846bc09e40af8b17356644bb6060.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor14A64CB015CA9BE3B6985632B158ADC3 implements org.drools.model.functions.Function1<org.karsun.Item, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "36EB04668A7C149A40518699CDFED700";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.String apply(org.karsun.Item _this) {
        return _this.getName();
    }
}
