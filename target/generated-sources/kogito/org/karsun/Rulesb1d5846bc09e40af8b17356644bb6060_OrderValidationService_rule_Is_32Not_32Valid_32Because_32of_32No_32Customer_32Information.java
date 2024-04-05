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

public class Rulesb1d5846bc09e40af8b17356644bb6060_OrderValidationService_rule_Is_32Not_32Valid_32Because_32of_32No_32Customer_32Information {

    /**
     * Rule name: Is Not Valid Because of No Customer Information
     */
    public static org.drools.model.Rule rule_Is_32Not_32Valid_32Because_32of_32No_32Customer_32Information() {
        final org.drools.model.Variable<org.karsun.Order> var_$order = D.declarationOf(org.karsun.Order.class,
                                                                                       DomainClassesMetadatab1d5846bc09e40af8b17356644bb6060.org_karsun_Order_Metadata_INSTANCE,
                                                                                       "$order",
                                                                                       D.entryPoint("orders"));
        org.drools.model.Rule rule = D.rule("org.karsun",
                                            "Is Not Valid Because of No Customer Information")
                                      .unit(org.karsun.OrderValidationService.class)
                                      .build(D.pattern(var_$order).expr("GENERATED_9AD50655AA1CDC808270B92848A02DAE",
                                                                        org.karsun.PE1.LambdaPredicateE194F4231328FFC3C4726D145B2DCF6B.INSTANCE,
                                                                        D.reactOn("customer")),
                                             D.on(var_orderValidResponses).execute(org.karsun.P29.LambdaConsequence29F32F54C07D19DB19A806B93455FD75.INSTANCE));
        return rule;
    }
}
