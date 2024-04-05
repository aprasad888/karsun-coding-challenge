package org.karsun;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.karsun.Order;
import org.karsun.Customer;
import org.karsun.ItemStore;
import org.karsun.Item;
import org.karsun.OrderValidResponse;
import static org.karsun.Rulesce63e72f6c7a4e00932dcc8befb4292c.*;

public class Rulesce63e72f6c7a4e00932dcc8befb4292c_OrderValidationService extends Rulesce63e72f6c7a4e00932dcc8befb4292c {

    @Override
    public String getName() {
        return super.getName() + ".OrderValidationService";
    }

    @Override
    public String getPackageName() {
        return super.getName();
    }

    /**
     * With the following expression ID:
     * org.drools.model.codegen.execmodel.generator.DRLIdGenerator@4b3ca903
     */
    @Override
    public java.util.List<org.drools.model.Rule> getRules() {
        return rules;
    }

    public java.util.List<org.drools.model.Rule> getRulesList() {
        return java.util.Arrays.asList(Rulesce63e72f6c7a4e00932dcc8befb4292c_OrderValidationService_rule_Is_32Not_32Valid_32Because_32of_32Low_32Stock.rule_Is_32Not_32Valid_32Because_32of_32Low_32Stock(),
                                       Rulesce63e72f6c7a4e00932dcc8befb4292c_OrderValidationService_rule_Is_32Not_32Valid_32Because_32of_32No_32Stock.rule_Is_32Not_32Valid_32Because_32of_32No_32Stock(),
                                       Rulesce63e72f6c7a4e00932dcc8befb4292c_OrderValidationService_rule_Is_32Not_32Valid_32Because_32of_32No_32Customer_32Information.rule_Is_32Not_32Valid_32Because_32of_32No_32Customer_32Information(),
                                       Rulesce63e72f6c7a4e00932dcc8befb4292c_OrderValidationService_rule_Is_32Not_32Valid_32Because_32of_32Customer_32Credit_32Card.rule_Is_32Not_32Valid_32Because_32of_32Customer_32Credit_32Card(),
                                       Rulesce63e72f6c7a4e00932dcc8befb4292c_OrderValidationService_rule_Is_32Not_32Valid_32Because_32of_32Customer_32Address.rule_Is_32Not_32Valid_32Because_32of_32Customer_32Address(),
                                       Rulesce63e72f6c7a4e00932dcc8befb4292c_OrderValidationService_rule_Is_32Valid.rule_Is_32Valid());
    }

    java.util.List<org.drools.model.Rule> rules = getRulesList();

    @Override
    public java.util.List<org.drools.model.EntryPoint> getEntryPoints() {
        return java.util.Arrays.asList(D.entryPoint("orderValidResponses"),
                                       D.entryPoint("orders"),
                                       D.entryPoint("items"));
    }

    public static final org.drools.model.Global<org.drools.ruleunits.api.DataStore<org.karsun.OrderValidResponse>> var_orderValidResponses = D.globalOf(new org.drools.model.TypeReference<org.drools.ruleunits.api.DataStore<org.karsun.OrderValidResponse>>(org.drools.ruleunits.api.DataStore.class),
                                                                                                                                                        "org.karsun",
                                                                                                                                                        "orderValidResponses");

    public static final org.drools.model.Global<org.drools.ruleunits.api.DataStore<org.karsun.Order>> var_orders = D.globalOf(new org.drools.model.TypeReference<org.drools.ruleunits.api.DataStore<org.karsun.Order>>(org.drools.ruleunits.api.DataStore.class),
                                                                                                                              "org.karsun",
                                                                                                                              "orders");

    public static final org.drools.model.Global<org.drools.ruleunits.api.DataStore<org.karsun.Item>> var_items = D.globalOf(new org.drools.model.TypeReference<org.drools.ruleunits.api.DataStore<org.karsun.Item>>(org.drools.ruleunits.api.DataStore.class),
                                                                                                                            "org.karsun",
                                                                                                                            "items");

    @Override
    public java.util.List<org.drools.model.Query> getQueries() {
        return java.util.Collections.emptyList();
    }

    {
        globals.add(var_orderValidResponses);
        globals.add(var_orders);
        globals.add(var_items);
    }
}
