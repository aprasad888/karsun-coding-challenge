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

public class Rulesb1d5846bc09e40af8b17356644bb6060_OrderValidationService_rule_Is_32Not_32Valid_32Because_32of_32Customer_32Address {

    /**
     * Rule name: Is Not Valid Because of Customer Address
     */
    public static org.drools.model.Rule rule_Is_32Not_32Valid_32Because_32of_32Customer_32Address() {
        final org.drools.model.Variable<org.karsun.Order> var_$order = D.declarationOf(org.karsun.Order.class,
                                                                                       DomainClassesMetadatab1d5846bc09e40af8b17356644bb6060.org_karsun_Order_Metadata_INSTANCE,
                                                                                       "$order",
                                                                                       D.entryPoint("orders"));
        org.drools.model.Rule rule = D.rule("org.karsun",
                                            "Is Not Valid Because of Customer Address")
                                      .unit(org.karsun.OrderValidationService.class)
                                      .build(D.pattern(var_$order).expr("GENERATED_01833F7CAEC7C27918E501472C0E1C7F",
                                                                        org.karsun.PB2.LambdaPredicateB26F8B8415E5D260E8718CD3EAEAD8AB.INSTANCE,
                                                                        D.reactOn("customer")).expr("GENERATED_32119B74D2E2088FB5678D31A7534D8F",
                                                                                                    org.karsun.PBC.LambdaPredicateBC9D8DC7B827C0D67C66E1070DC1A6D9.INSTANCE,
                                                                                                    D.reactOn("customer")),
                                             D.on(var_orderValidResponses).execute(org.karsun.P9E.LambdaConsequence9EECA4F6EC8DCEA8CCA499D930190301.INSTANCE));
        return rule;
    }
}
