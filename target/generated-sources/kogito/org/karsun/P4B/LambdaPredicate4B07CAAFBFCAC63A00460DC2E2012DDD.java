package org.karsun.P4B;


import static org.karsun.Rulesce63e72f6c7a4e00932dcc8befb4292c.*;
import org.karsun.Order;
import org.karsun.*;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate4B07CAAFBFCAC63A00460DC2E2012DDD implements org.drools.model.functions.Predicate2<org.karsun.Item, org.karsun.Order>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "9AA33A3BDD623023D22BDABA0D3A290F";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.karsun.Item _this, org.karsun.Order $order) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getQuantity(), $order.getItem().getQuantity());
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("quantity > $order.getItem().getQuantity()");
        info.addRuleNames("Is Valid", "/Users/anushaprasad/Documents/GitHub/karsun-coding-challenge/src/main/resources/OrderValidationService.drl");
        return info;
    }
}
