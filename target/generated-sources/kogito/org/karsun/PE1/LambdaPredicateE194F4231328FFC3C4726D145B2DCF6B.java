package org.karsun.PE1;


import static org.karsun.Rulesb1d5846bc09e40af8b17356644bb6060.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateE194F4231328FFC3C4726D145B2DCF6B implements org.drools.model.functions.Predicate1<org.karsun.Order>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "3B1C9C8E325208304D07BD293657F200";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.karsun.Order _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getCustomer(), null);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("customer == null");
        info.addRuleNames("Is Not Valid Because of No Customer Information", "/Users/anushaprasad/Documents/GitHub/karsun-coding-challenge/src/main/resources/OrderValidationService.drl");
        return info;
    }
}
