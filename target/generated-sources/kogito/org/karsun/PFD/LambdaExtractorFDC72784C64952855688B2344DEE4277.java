package org.karsun.PFD;


import static org.karsun.Rulesce63e72f6c7a4e00932dcc8befb4292c.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorFDC72784C64952855688B2344DEE4277 implements org.drools.model.functions.Function1<org.karsun.Order, java.lang.Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "5C495546BD066A4DF2FA0A8735384E32";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.Integer apply(org.karsun.Order _this) {
        return _this.getItem().getQuantity();
    }
}
