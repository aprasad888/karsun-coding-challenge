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

public class Rulesce63e72f6c7a4e00932dcc8befb4292c_OrderValidationService_rule_Is_32Not_32Valid_32Because_32of_32No_32Stock {

    /**
     * Rule name: Is Not Valid Because of No Stock
     */
    public static org.drools.model.Rule rule_Is_32Not_32Valid_32Because_32of_32No_32Stock() {
        final org.drools.model.Variable<org.karsun.Item> var_GENERATED_$pattern_Item$62$ = D.declarationOf(org.karsun.Item.class,
                                                                                                           DomainClassesMetadatace63e72f6c7a4e00932dcc8befb4292c.org_karsun_Item_Metadata_INSTANCE,
                                                                                                           "GENERATED_$pattern_Item$62$",
                                                                                                           D.entryPoint("items"));
        final org.drools.model.Variable<java.lang.String> var_itemName = D.declarationOf(java.lang.String.class,
                                                                                         DomainClassesMetadatace63e72f6c7a4e00932dcc8befb4292c.java_lang_String_Metadata_INSTANCE,
                                                                                         "itemName");
        final org.drools.model.Variable<java.lang.Integer> var_itemQuantity = D.declarationOf(java.lang.Integer.class,
                                                                                              DomainClassesMetadatace63e72f6c7a4e00932dcc8befb4292c.java_lang_Integer_Metadata_INSTANCE,
                                                                                              "itemQuantity");
        final org.drools.model.Variable<org.karsun.Order> var_$order = D.declarationOf(org.karsun.Order.class,
                                                                                       DomainClassesMetadatace63e72f6c7a4e00932dcc8befb4292c.org_karsun_Order_Metadata_INSTANCE,
                                                                                       "$order",
                                                                                       D.entryPoint("orders"));
        org.drools.model.Rule rule = D.rule("org.karsun",
                                            "Is Not Valid Because of No Stock")
                                      .unit(org.karsun.OrderValidationService.class)
                                      .build(D.pattern(var_GENERATED_$pattern_Item$62$).bind(var_itemName,
                                                                                             org.karsun.P7A.LambdaExtractor7A051ED9F3874CF6419B5EBBD0A31DAC.INSTANCE,
                                                                                             D.reactOn("name")).bind(var_itemQuantity,
                                                                                                                     org.karsun.PDE.LambdaExtractorDEFFED77D68D7A9CCF62531B85CA7BC7.INSTANCE,
                                                                                                                     D.reactOn("quantity")),
                                             D.pattern(var_$order).expr("GENERATED_54D677131DB12756B41B913EAEF4B92E",
                                                                        var_itemName,
                                                                        org.karsun.P83.LambdaPredicate8364ADB5918435C70158E465E67F7A81.INSTANCE,
                                                                        D.betaIndexedBy(java.lang.String.class,
                                                                                        org.drools.model.Index.ConstraintType.EQUAL,
                                                                                        -1,
                                                                                        org.karsun.PB2.LambdaExtractorB28F7A8ED8E68BB8E0C4F7E7E4F51282.INSTANCE,
                                                                                        org.karsun.P45.LambdaExtractor454CB0619D598E986ED9389C3E749C3A.INSTANCE,
                                                                                        java.lang.String.class),
                                                                        D.reactOn("item")).expr("GENERATED_CA7E82ED15D658908027DDEA3E26D624",
                                                                                                var_itemQuantity,
                                                                                                org.karsun.P12.LambdaPredicate124181281603C709CA511A715DF97B51.INSTANCE),
                                             D.on(var_orderValidResponses).execute(org.karsun.P22.LambdaConsequence22E03C41FA078911F766ED04D892711F.INSTANCE));
        return rule;
    }
}
