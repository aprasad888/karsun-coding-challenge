package org.karsun.P6E;


import static org.karsun.Rulesb1d5846bc09e40af8b17356644bb6060.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate6E9E58CBFACA81A57A4DD1A03E73BDF6 implements org.drools.model.functions.Predicate2<org.karsun.Order, java.lang.String>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "393D4B1E6B7C1665D2346FF3156560FC";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.karsun.Order _this, java.lang.String itemName) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.getItem().getName(), itemName);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("item.name == itemName");
        info.addRuleNames("Is Not Valid Because of Low Stock", "/Users/anushaprasad/Documents/GitHub/karsun-coding-challenge/src/main/resources/OrderValidationService.drl", "Is Not Valid Because of No Stock", "/Users/anushaprasad/Documents/GitHub/karsun-coding-challenge/src/main/resources/OrderValidationService.drl", "Is Valid", "/Users/anushaprasad/Documents/GitHub/karsun-coding-challenge/src/main/resources/OrderValidationService.drl");
        return info;
    }
}
