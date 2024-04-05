package org.karsun;

import org.drools.core.SessionConfiguration;
import org.drools.core.common.ReteEvaluator;
import org.drools.core.impl.InternalRuleBase;
import org.drools.modelcompiler.KieBaseBuilder;
import org.drools.ruleunits.api.RuleUnit;
import org.drools.ruleunits.api.conf.RuleConfig;
import org.drools.ruleunits.api.RuleUnits;
import org.drools.ruleunits.impl.factory.AbstractRuleUnit;
import org.drools.ruleunits.impl.factory.AbstractRuleUnits;
import org.drools.ruleunits.impl.ReteEvaluatorBasedRuleUnitInstance;
import org.drools.ruleunits.impl.sessions.RuleUnitExecutorImpl;

@org.springframework.stereotype.Component
public class OrderValidationServiceRuleUnit extends AbstractRuleUnit<org.karsun.OrderValidationService> {

    private static final InternalRuleBase ruleBase = KieBaseBuilder.createKieBaseFromModel(new org.karsun.Rulesce63e72f6c7a4e00932dcc8befb4292c_OrderValidationService(),
                                                                                           new org.kie.api.conf.KieBaseOption[] { org.kie.api.conf.EventProcessingOption.CLOUD });

    private static final SessionConfiguration sessionConfiguration = ruleBase.getSessionConfiguration().as(SessionConfiguration.KEY);

    static {
        sessionConfiguration.setOption(org.kie.api.runtime.conf.ClockTypeOption.REALTIME);
    }

    public OrderValidationServiceRuleUnit() {
        this(null);
    }

    @org.springframework.beans.factory.annotation.Autowired(required = false)
    public OrderValidationServiceRuleUnit(RuleUnits ruleUnits) {
        super(org.karsun.OrderValidationService.class,
              ruleUnits);
        this.ruleUnits.register(this);
    }

    @Override
    public OrderValidationServiceRuleUnitInstance internalCreateInstance(org.karsun.OrderValidationService data, RuleConfig ruleConfig) {
        ReteEvaluator reteEvaluator = evaluatorConfigurator.apply(new RuleUnitExecutorImpl(ruleBase,
                                                                                           sessionConfiguration));
        return new OrderValidationServiceRuleUnitInstance(this,
                                                          data,
                                                          reteEvaluator,
                                                          ruleConfig);
    }
}
