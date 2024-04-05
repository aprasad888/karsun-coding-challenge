package org.karsun.PD3;


import static org.karsun.Rulesb1d5846bc09e40af8b17356644bb6060.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateD39FDCC744E3E435B0AE073B922EEC5A implements org.drools.model.functions.Predicate1<org.karsun.Order>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "762ACAD1232A20CEF84D2E3A0D42AF4E";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.karsun.Order _this) throws java.lang.Exception {
        return !org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getCustomer().getCreditCard(), null);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("customer.creditCard != null");
        info.addRuleNames("Is Valid", "/Users/anushaprasad/Documents/GitHub/karsun-coding-challenge/src/main/resources/OrderValidationService.drl");
        return info;
    }
}
