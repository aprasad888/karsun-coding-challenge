package org.karsun;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.karsun.Order;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import static org.karsun.Rulesce63e72f6c7a4e00932dcc8befb4292c.*;
import static org.karsun.Rulesce63e72f6c7a4e00932dcc8befb4292c_OrderValidationService.*;

public class Rulesce63e72f6c7a4e00932dcc8befb4292c_OrderValidationService_rule_Is_32Not_32Valid_32Because_32of_32No_32Customer_32Information {

    /**
     * Rule name: Is Not Valid Because of No Customer Information
     */
    public static org.drools.model.Rule rule_Is_32Not_32Valid_32Because_32of_32No_32Customer_32Information() {
        final org.drools.model.Variable<org.karsun.Order> var_$order = D.declarationOf(org.karsun.Order.class,
                                                                                       DomainClassesMetadatace63e72f6c7a4e00932dcc8befb4292c.org_karsun_Order_Metadata_INSTANCE,
                                                                                       "$order",
                                                                                       D.entryPoint("orders"));
        org.drools.model.Rule rule = D.rule("org.karsun",
                                            "Is Not Valid Because of No Customer Information")
                                      .unit(org.karsun.OrderValidationService.class)
                                      .build(D.pattern(var_$order).expr("GENERATED_9AD50655AA1CDC808270B92848A02DAE",
                                                                        org.karsun.P70.LambdaPredicate70ACC3D046963814EAD97DE3CCD51CBC.INSTANCE,
                                                                        D.reactOn("customer")),
                                             D.on(var_orderValidResponses).execute(org.karsun.P3D.LambdaConsequence3D019FFD5EAF203F10693A1903A7554E.INSTANCE));
        return rule;
    }
}
