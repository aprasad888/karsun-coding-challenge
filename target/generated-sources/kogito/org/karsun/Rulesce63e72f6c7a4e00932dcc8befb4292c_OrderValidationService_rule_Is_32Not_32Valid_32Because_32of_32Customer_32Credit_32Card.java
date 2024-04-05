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

public class Rulesce63e72f6c7a4e00932dcc8befb4292c_OrderValidationService_rule_Is_32Not_32Valid_32Because_32of_32Customer_32Credit_32Card {

    /**
     * Rule name: Is Not Valid Because of Customer Credit Card
     */
    public static org.drools.model.Rule rule_Is_32Not_32Valid_32Because_32of_32Customer_32Credit_32Card() {
        final org.drools.model.Variable<org.karsun.Order> var_$order = D.declarationOf(org.karsun.Order.class,
                                                                                       DomainClassesMetadatace63e72f6c7a4e00932dcc8befb4292c.org_karsun_Order_Metadata_INSTANCE,
                                                                                       "$order",
                                                                                       D.entryPoint("orders"));
        org.drools.model.Rule rule = D.rule("org.karsun",
                                            "Is Not Valid Because of Customer Credit Card")
                                      .unit(org.karsun.OrderValidationService.class)
                                      .build(D.pattern(var_$order).expr("GENERATED_01833F7CAEC7C27918E501472C0E1C7F",
                                                                        org.karsun.P78.LambdaPredicate7898A68C6ABE39011A8B0327E49F48C3.INSTANCE,
                                                                        D.reactOn("customer")).expr("GENERATED_34F0DD4BE046F3C5190BFCC479B589B7",
                                                                                                    org.karsun.PCC.LambdaPredicateCC1DC262840299DFF44E45F212E932CF.INSTANCE,
                                                                                                    D.reactOn("customer")),
                                             D.on(var_orderValidResponses).execute(org.karsun.P0F.LambdaConsequence0F3A1EC418AD9A8F86C2188AF854453E.INSTANCE));
        return rule;
    }
}
