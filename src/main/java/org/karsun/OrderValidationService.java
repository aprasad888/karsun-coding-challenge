package org.karsun;

import org.drools.ruleunits.api.DataSource;
import org.drools.ruleunits.api.DataStore;
import org.drools.ruleunits.api.RuleUnitData;

public class OrderValidationService implements RuleUnitData {

    private DataStore<Order> orders = DataSource.createStore();
    private DataStore<OrderValidResponse> orderValidResponses = DataSource.createStore();
    private DataStore<Item> items = DataSource.createStore();
    private ItemStore store = new ItemStore();

    public DataStore<Order> getOrders() {
        return orders;
    }

    public DataStore<OrderValidResponse> getOrderValidResponses() {
        return orderValidResponses;
    }

    public DataStore<Item> getItems() {
        for (Item item : this.store.getStore()) {
            items.add(item);
        }

        return items;
    }

    public DataStore<Item> setItems(Item item) {
        store.updateItemQuantity(item);
        return getItems();
    }

}
