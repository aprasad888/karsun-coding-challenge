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

public class Rulesb1d5846bc09e40af8b17356644bb6060_OrderValidationService_rule_Is_32Valid {

    /**
     * Rule name: Is Valid
     */
    public static org.drools.model.Rule rule_Is_32Valid() {
        final org.drools.model.Variable<org.karsun.Item> var_GENERATED_$pattern_Item$60$ = D.declarationOf(org.karsun.Item.class,
                                                                                                           DomainClassesMetadatab1d5846bc09e40af8b17356644bb6060.org_karsun_Item_Metadata_INSTANCE,
                                                                                                           "GENERATED_$pattern_Item$60$",
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
        final org.drools.model.Variable<org.karsun.Item> var_$item = D.declarationOf(org.karsun.Item.class,
                                                                                     DomainClassesMetadatab1d5846bc09e40af8b17356644bb6060.org_karsun_Item_Metadata_INSTANCE,
                                                                                     "$item",
                                                                                     D.entryPoint("items"));
        org.drools.model.Rule rule = D.rule("org.karsun",
                                            "Is Valid")
                                      .unit(org.karsun.OrderValidationService.class)
                                      .build(D.pattern(var_GENERATED_$pattern_Item$60$).bind(var_itemName,
                                                                                             org.karsun.P14.LambdaExtractor14A64CB015CA9BE3B6985632B158ADC3.INSTANCE,
                                                                                             D.reactOn("name")).expr("GENERATED_0341FD1E9270D17EA7BBCBCA6E353302",
                                                                                                                     org.karsun.PE2.LambdaPredicateE2A4A9515D2CAE68B294289584E1A3AA.INSTANCE,
                                                                                                                     D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                                      org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                                      DomainClassesMetadatab1d5846bc09e40af8b17356644bb6060.org_karsun_Item_Metadata_INSTANCE.getPropertyIndex("quantity"),
                                                                                                                                      org.karsun.P21.LambdaExtractor21BD03E18F90A6579CFAB6FCD93C1A67.INSTANCE,
                                                                                                                                      1),
                                                                                                                     D.reactOn("quantity")).bind(var_itemQuantity,
                                                                                                                                                 org.karsun.P21.LambdaExtractor21BD03E18F90A6579CFAB6FCD93C1A67.INSTANCE,
                                                                                                                                                 D.reactOn("quantity")),
                                             D.pattern(var_$order).expr("GENERATED_01833F7CAEC7C27918E501472C0E1C7F",
                                                                        org.karsun.PB2.LambdaPredicateB26F8B8415E5D260E8718CD3EAEAD8AB.INSTANCE,
                                                                        D.reactOn("customer")).expr("GENERATED_EA563823B69502D1FB76680ACF32C900",
                                                                                                    org.karsun.PD3.LambdaPredicateD39FDCC744E3E435B0AE073B922EEC5A.INSTANCE,
                                                                                                    D.reactOn("customer")).expr("GENERATED_B86EFC8DDCDB5EB91EE0A36F03606CFE",
                                                                                                                                org.karsun.P70.LambdaPredicate701A508D32B413A3F23C5A4E00E02FAC.INSTANCE,
                                                                                                                                D.reactOn("customer")).expr("GENERATED_54D677131DB12756B41B913EAEF4B92E",
                                                                                                                                                            var_itemName,
                                                                                                                                                            org.karsun.P6E.LambdaPredicate6E9E58CBFACA81A57A4DD1A03E73BDF6.INSTANCE,
                                                                                                                                                            D.betaIndexedBy(java.lang.String.class,
                                                                                                                                                                            org.drools.model.Index.ConstraintType.EQUAL,
                                                                                                                                                                            -1,
                                                                                                                                                                            org.karsun.P2D.LambdaExtractor2D1310348C49DF12B1326F531BC123DD.INSTANCE,
                                                                                                                                                                            org.karsun.PD9.LambdaExtractorD9432E85B66AEF7EC30718094C749BF4.INSTANCE,
                                                                                                                                                                            java.lang.String.class),
                                                                                                                                                            D.reactOn("item")).expr("GENERATED_6AEFE91C68CE80644F2E281C9A4D2E4A",
                                                                                                                                                                                    var_itemQuantity,
                                                                                                                                                                                    org.karsun.P13.LambdaPredicate13A397C9AD508C06EDCF6EADC4C3686D.INSTANCE,
                                                                                                                                                                                    D.betaIndexedBy(java.lang.Integer.class,
                                                                                                                                                                                                    org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                                                                                    -1,
                                                                                                                                                                                                    org.karsun.PF7.LambdaExtractorF72BB50E42DBFD343F8A05BD8094911A.INSTANCE,
                                                                                                                                                                                                    org.karsun.P66.LambdaExtractor663AA5DC829EBBE6D4B8533254ED4B06.INSTANCE,
                                                                                                                                                                                                    java.lang.Integer.class),
                                                                                                                                                                                    D.reactOn("item")).watch("item"),
                                             D.pattern(var_$item).expr("GENERATED_F38BECE42D15F295A872F94502315939",
                                                                       var_$order,
                                                                       org.karsun.PED.LambdaPredicateED0C560D88DEDBD531FFC7AA877936B9.INSTANCE,
                                                                       D.reactOn("name")).expr("GENERATED_0341FD1E9270D17EA7BBCBCA6E353302",
                                                                                               org.karsun.PE2.LambdaPredicateE2A4A9515D2CAE68B294289584E1A3AA.INSTANCE,
                                                                                               D.alphaIndexedBy(java.lang.Integer.class,
                                                                                                                org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                DomainClassesMetadatab1d5846bc09e40af8b17356644bb6060.org_karsun_Item_Metadata_INSTANCE.getPropertyIndex("quantity"),
                                                                                                                org.karsun.P21.LambdaExtractor21BD03E18F90A6579CFAB6FCD93C1A67.INSTANCE,
                                                                                                                1),
                                                                                               D.reactOn("quantity")).expr("GENERATED_1BF8F2189838D1001E6B0124A71513BA",
                                                                                                                           var_$order,
                                                                                                                           org.karsun.P62.LambdaPredicate6242B3BD35C928F2796725744E0BBE1B.INSTANCE,
                                                                                                                           D.reactOn("quantity")),
                                             D.on(var_orderValidResponses,
                                                  var_$order,
                                                  var_$item,
                                                  var_items).execute(org.karsun.P32.LambdaConsequence32E0985FB46D2ED82E97823FD70BD24C.INSTANCE));
        return rule;
    }
}
