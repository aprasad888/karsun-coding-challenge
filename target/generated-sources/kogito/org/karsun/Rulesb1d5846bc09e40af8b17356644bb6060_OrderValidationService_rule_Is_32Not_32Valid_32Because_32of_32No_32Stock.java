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

public class Rulesb1d5846bc09e40af8b17356644bb6060_OrderValidationService_rule_Is_32Not_32Valid_32Because_32of_32No_32Stock {

    /**
     * Rule name: Is Not Valid Because of No Stock
     */
    public static org.drools.model.Rule rule_Is_32Not_32Valid_32Because_32of_32No_32Stock() {
        final org.drools.model.Variable<org.karsun.Item> var_GENERATED_$pattern_Item$59$ = D.declarationOf(org.karsun.Item.class,
                                                                                                           DomainClassesMetadatab1d5846bc09e40af8b17356644bb6060.org_karsun_Item_Metadata_INSTANCE,
                                                                                                           "GENERATED_$pattern_Item$59$",
                                                                                                           D.entryPoint("items"));
        final org.drools.model.Variable<java.lang.String> var_itemName = D.declarationOf(java.lang.String.class,
                                                                                         DomainClassesMetadatab1d5846bc09e40af8b17356644bb6060.java_lang_String_Metadata_INSTANCE,
                                                                                         "itemName");
        final org.drools.model.Variable<java.lang.Integer> var_itemQuantity = D.declarationOf(java.lang.Integer.class,
                                                                                              DomainClassesMetadatab1d5846bc09e40af8b17356644bb6060.java_lang_Integer_Metadata_INSTANCE,
                                                                                              "itemQuantity");
        final org.drools.model.Variable<org.karsun.Order> var_$order = D.declarationOf(org.karsun.Order.class,
                                                                                       DomainClassesMetadatab1d5846bc09e40af8b17356644bb6060.org_karsun_Order_Metadata_INSTANCE,
                                                                                       "$order",
                                                                                       D.entryPoint("orders"));
        org.drools.model.Rule rule = D.rule("org.karsun",
                                            "Is Not Valid Because of No Stock")
                                      .unit(org.karsun.OrderValidationService.class)
                                      .build(D.pattern(var_GENERATED_$pattern_Item$59$).bind(var_itemName,
                                                                                             org.karsun.P14.LambdaExtractor14A64CB015CA9BE3B6985632B158ADC3.INSTANCE,
                                                                                             D.reactOn("name")).bind(var_itemQuantity,
                                                                                                                     org.karsun.P21.LambdaExtractor21BD03E18F90A6579CFAB6FCD93C1A67.INSTANCE,
                                                                                                                     D.reactOn("quantity")),
                                             D.pattern(var_$order).expr("GENERATED_54D677131DB12756B41B913EAEF4B92E",
                                                                        var_itemName,
                                                                        org.karsun.P6E.LambdaPredicate6E9E58CBFACA81A57A4DD1A03E73BDF6.INSTANCE,
                                                                        D.betaIndexedBy(java.lang.String.class,
                                                                                        org.drools.model.Index.ConstraintType.EQUAL,
                                                                                        -1,
                                                                                        org.karsun.P2D.LambdaExtractor2D1310348C49DF12B1326F531BC123DD.INSTANCE,
                                                                                        org.karsun.PD9.LambdaExtractorD9432E85B66AEF7EC30718094C749BF4.INSTANCE,
                                                                                        java.lang.String.class),
                                                                        D.reactOn("item")).expr("GENERATED_CA7E82ED15D658908027DDEA3E26D624",
                                                                                                var_itemQuantity,
                                                                                                org.karsun.P5D.LambdaPredicate5DA5A15C102F46720E03A9DC428490C3.INSTANCE),
                                             D.on(var_orderValidResponses).execute(org.karsun.PB9.LambdaConsequenceB9EE9D318FF6D3985AC9F1FB1E93AB19.INSTANCE));
        return rule;
    }
}
