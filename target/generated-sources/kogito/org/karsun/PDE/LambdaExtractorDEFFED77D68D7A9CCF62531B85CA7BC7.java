package org.karsun.PDE;


import static org.karsun.Rulesce63e72f6c7a4e00932dcc8befb4292c.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorDEFFED77D68D7A9CCF62531B85CA7BC7 implements org.drools.model.functions.Function1<org.karsun.Item, java.lang.Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "0AD4968B93DB30E5022635F5F7C2D909";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public java.lang.Integer apply(org.karsun.Item _this) {
        return _this.getQuantity();
    }
}
