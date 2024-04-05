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

public class Rulesce63e72f6c7a4e00932dcc8befb4292c_OrderValidationService_rule_Is_32Valid {

    /**
     * Rule name: Is Valid
     */
    public static org.drools.model.Rule rule_Is_32Valid() {
        final org.drools.model.Variable<org.karsun.Item> var_GENERATED_$pattern_Item$63$ = D.declarationOf(org.karsun.Item.class,
                                                                                                           DomainClassesMetadatace63e72f6c7a4e00932dcc8befb4292c.org_karsun_Item_Metadata_INSTANCE,
                                                                                                           "GENERATED_$pattern_Item$63$",
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
        final org.drools.model.Variable<org.karsun.Item> var_$item = D.declarationOf(org.karsun.Item.class,
                                                                                     DomainClassesMetadatace63e72f6c7a4e00932dcc8befb4292c.org_karsun_Item_Metadata_INSTANCE,
                                                                                     "$item",
                                                                                     D.entryPoint("items"));
        org.drools.model.Rule rule = D.rule("org.karsun",
                                            "Is Valid")
                                      .unit(org.karsun.OrderValidationService.class)
                                      .build(D.pattern(var_GENERATED_$pattern_Item$63$).bind(var_itemName,
                                                                                             org.karsun.P7A.LambdaExtractor7A051ED9F3874CF6419B5EBBD0A31DAC.INSTANCE,
                                                                                             D.reactOn("name")).expr("GENERATED_0341FD1E9270D17EA7BBCBCA6E353302",
                                                                                                                     org.karsun.PDE.LambdaPredicateDE203B98E39649BD6985E546290DDADB.INSTANCE,
                                                                                                                     D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                                      DomainClassesMetadatace63e72f6c7a4e00932dcc8befb4292c.org_karsun_Item_Metadata_INSTANCE.getPropertyIndex("quantity"),
                                                                                                                                      org.karsun.PDE.LambdaExtractorDEFFED77D68D7A9CCF62531B85CA7BC7.INSTANCE,
                                                                                                                                      1),
                                                                                                                     D.reactOn("quantity")).bind(var_itemQuantity,
                                                                                                                                                 org.karsun.PDE.LambdaExtractorDEFFED77D68D7A9CCF62531B85CA7BC7.INSTANCE,
                                                                                                                                                 D.reactOn("quantity")),
                                             D.pattern(var_$order).expr("GENERATED_01833F7CAEC7C27918E501472C0E1C7F",
                                                                        org.karsun.P78.LambdaPredicate7898A68C6ABE39011A8B0327E49F48C3.INSTANCE,
                                                                        D.reactOn("customer")).expr("GENERATED_EA563823B69502D1FB76680ACF32C900",
                                                                                                    org.karsun.P58.LambdaPredicate58AFA1BEF2B29614576C4A5D1B6CB767.INSTANCE,
                                                                                                    D.reactOn("customer")).expr("GENERATED_B86EFC8DDCDB5EB91EE0A36F03606CFE",
                                                                                                                                org.karsun.PA0.LambdaPredicateA0ED7B0563403F55A24FBB6BE3C64964.INSTANCE,
                                                                                                                                D.reactOn("customer")).expr("GENERATED_54D677131DB12756B41B913EAEF4B92E",
                                                                                                                                                            var_itemName,
                                                                                                                                                            org.karsun.P83.LambdaPredicate8364ADB5918435C70158E465E67F7A81.INSTANCE,
                                                                                                                                                            D.betaIndexedBy(java.lang.String.class,
                                                                                                                                                                            org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                            -1,
                                                                                                                                                                            org.karsun.PB2.LambdaExtractorB28F7A8ED8E68BB8E0C4F7E7E4F51282.INSTANCE,
                                                                                                                                                                            org.karsun.P45.LambdaExtractor454CB0619D598E986ED9389C3E749C3A.INSTANCE,
                                                                                                                                                                            java.lang.String.class),
                                                                                                                                                            D.reactOn("item")).expr("GENERATED_6AEFE91C68CE80644F2E281C9A4D2E4A",
                                                                                                                                                                                    var_itemQuantity,
                                                                                                                                                                                    org.karsun.PE4.LambdaPredicateE42C33B6970F0C3667E77633773C9FF8.INSTANCE,
                                                                                                                                                                                    D.betaIndexedBy(java.lang.Integer.class,
                                                                                                                                                                                                    org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                                                                                    -1,
                                                                                                                                                                                                    org.karsun.PFD.LambdaExtractorFDC72784C64952855688B2344DEE4277.INSTANCE,
                                                                                                                                                                                                    org.karsun.P8A.LambdaExtractor8A8609E7BA2BB78725D0D5EE964F21D0.INSTANCE,
                                                                                                                                                                                                    java.lang.Integer.class),
                                                                                                                                                                                    D.reactOn("item")).watch("item"),
                                             D.pattern(var_$item).expr("GENERATED_F38BECE42D15F295A872F94502315939",
                                                                       var_$order,
                                                                       org.karsun.P89.LambdaPredicate89A11057BF2FB3F00C9949DF105F297A.INSTANCE,
                                                                       D.reactOn("name")).expr("GENERATED_0341FD1E9270D17EA7BBCBCA6E353302",
                                                                                               org.karsun.PDE.LambdaPredicateDE203B98E39649BD6985E546290DDADB.INSTANCE,
                                                                                               D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                DomainClassesMetadatace63e72f6c7a4e00932dcc8befb4292c.org_karsun_Item_Metadata_INSTANCE.getPropertyIndex("quantity"),
                                                                                                                org.karsun.PDE.LambdaExtractorDEFFED77D68D7A9CCF62531B85CA7BC7.INSTANCE,
                                                                                                                1),
                                                                                               D.reactOn("quantity")).expr("GENERATED_1BF8F2189838D1001E6B0124A71513BA",
                                                                                                                           var_$order,
                                                                                                                           org.karsun.P4B.LambdaPredicate4B07CAAFBFCAC63A00460DC2E2012DDD.INSTANCE,
                                                                                                                           D.reactOn("quantity")),
                                             D.on(var_orderValidResponses,
                                                  var_$order,
                                                  var_$item,
                                                  var_items).execute(org.karsun.P58.LambdaConsequence58917666505B2B8E66FF36DA75220D8F.INSTANCE));
        return rule;
    }
}
