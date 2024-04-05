package org.karsun;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.karsun.Order;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import static org.karsun.Rulesb1d5846bc09e40af8b17356644bb6060.*;
import static org.karsun.Rulesb1d5846bc09e40af8b17356644bb6060_OrderValidationService.*;

public class Rulesb1d5846bc09e40af8b17356644bb6060_OrderValidationService_rule_Is_32Not_32Valid_32Because_32of_32Customer_32Credit_32Card {

    /**
     * Rule name: Is Not Valid Because of Customer Credit Card
     */
    public static org.drools.model.Rule rule_Is_32Not_32Valid_32Because_32of_32Customer_32Credit_32Card() {
        final org.drools.model.Variable<org.karsun.Order> var_$order = D.declarationOf(org.karsun.Order.class,
                                                                                       DomainClassesMetadatab1d5846bc09e40af8b17356644bb6060.org_karsun_Order_Metadata_INSTANCE,
                                                                                       "$order",
                                                                                       D.entryPoint("orders"));
        org.drools.model.Rule rule = D.rule("org.karsun",
                                            "Is Not Valid Because of Customer Credit Card")
                                      .unit(org.karsun.OrderValidationService.class)
                                      .build(D.pattern(var_$order).expr("GENERATED_01833F7CAEC7C27918E501472C0E1C7F",
                                                                        org.karsun.PB2.LambdaPredicateB26F8B8415E5D260E8718CD3EAEAD8AB.INSTANCE,
                                                                        D.reactOn("customer")).expr("GENERATED_34F0DD4BE046F3C5190BFCC479B589B7",
                                                                                                    org.karsun.P7F.LambdaPredicate7F5AE388C405AC0070097089453AD9B4.INSTANCE,
                                                                                                    D.reactOn("customer")),
                                             D.on(var_orderValidResponses).execute(org.karsun.P4F.LambdaConsequence4F164BD5CFC254213F1885CD5B3C985F.INSTANCE));
        return rule;
    }
}
