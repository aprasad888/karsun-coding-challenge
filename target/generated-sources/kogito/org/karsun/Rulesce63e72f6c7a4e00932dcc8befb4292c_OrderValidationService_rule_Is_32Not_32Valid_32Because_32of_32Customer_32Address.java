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

public class Rulesce63e72f6c7a4e00932dcc8befb4292c_OrderValidationService_rule_Is_32Not_32Valid_32Because_32of_32Customer_32Address {

    /**
     * Rule name: Is Not Valid Because of Customer Address
     */
    public static org.drools.model.Rule rule_Is_32Not_32Valid_32Because_32of_32Customer_32Address() {
        final org.drools.model.Variable<org.karsun.Order> var_$order = D.declarationOf(org.karsun.Order.class,
                                                                                       DomainClassesMetadatace63e72f6c7a4e00932dcc8befb4292c.org_karsun_Order_Metadata_INSTANCE,
                                                                                       "$order",
                                                                                       D.entryPoint("orders"));
        org.drools.model.Rule rule = D.rule("org.karsun",
                                            "Is Not Valid Because of Customer Address")
                                      .unit(org.karsun.OrderValidationService.class)
                                      .build(D.pattern(var_$order).expr("GENERATED_01833F7CAEC7C27918E501472C0E1C7F",
                                                                        org.karsun.P78.LambdaPredicate7898A68C6ABE39011A8B0327E49F48C3.INSTANCE,
                                                                        D.reactOn("customer")).expr("GENERATED_32119B74D2E2088FB5678D31A7534D8F",
                                                                                                    org.karsun.P42.LambdaPredicate429137F07A5204AA0553167261328B8E.INSTANCE,
                                                                                                    D.reactOn("customer")),
                                             D.on(var_orderValidResponses).execute(org.karsun.P2B.LambdaConsequence2B88677AE9D99AAC2AAEF366948952E0.INSTANCE));
        return rule;
    }
}
