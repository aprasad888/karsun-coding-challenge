package org.karsun;

import org.drools.core.common.ReteEvaluator;
import org.drools.ruleunits.api.RuleUnit;
import org.drools.ruleunits.api.conf.RuleConfig;
import org.drools.ruleunits.impl.ReteEvaluatorBasedRuleUnitInstance;

public class OrderValidationServiceRuleUnitInstance extends ReteEvaluatorBasedRuleUnitInstance<org.karsun.OrderValidationService> {

    public OrderValidationServiceRuleUnitInstance(RuleUnit<org.karsun.OrderValidationService> unit, org.karsun.OrderValidationService workingMemory, ReteEvaluator reteEvaluator) {
        super(unit,
              workingMemory,
              reteEvaluator);
    }

    public OrderValidationServiceRuleUnitInstance(RuleUnit<org.karsun.OrderValidationService> unit, org.karsun.OrderValidationService workingMemory, ReteEvaluator reteEvaluator, RuleConfig ruleConfig) {
        super(unit,
              workingMemory,
              reteEvaluator,
              ruleConfig);
    }

    @Override
    protected void bind(ReteEvaluator evaluator, org.karsun.OrderValidationService ruleUnit) {
        ruleUnit.getOrderValidResponses()
                .subscribe(new org.drools.ruleunits.impl.EntryPointDataProcessor(evaluator.getEntryPoint("orderValidResponses")));
        evaluator.setGlobal("orderValidResponses",
                            ruleUnit.getOrderValidResponses());
        ruleUnit.getOrders()
                .subscribe(new org.drools.ruleunits.impl.EntryPointDataProcessor(evaluator.getEntryPoint("orders")));
        evaluator.setGlobal("orders",
                            ruleUnit.getOrders());
        ruleUnit.getItems()
                .subscribe(new org.drools.ruleunits.impl.EntryPointDataProcessor(evaluator.getEntryPoint("items")));
        evaluator.setGlobal("items",
                            ruleUnit.getItems());
    }
}
