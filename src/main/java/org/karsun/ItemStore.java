package org.karsun;

import java.util.ArrayList;
import java.util.List;

public class ItemStore {

    private List<Item> store = new ArrayList<>();

    public ItemStore() {
        Item adidas = new Item("Adidas", 100);
        Item nikes = new Item("Nikes", 100);
        Item crocs = new Item("Crocs", 100);
        Item skechers = new Item("Skechers", 100);
        Item asics = new Item("Asics", 100);
        store.add(adidas);
        store.add(nikes);
        store.add(crocs);
        store.add(skechers);
        store.add(asics);
    }

    public List<Item> getStore() {
        return this.store;
    }

    public void addToStore(Item item) {
        this.store.add(item);
    }

    public void removeFromStore(Item item) {
        this.store.remove(item);
    }

    public void updateItemQuantity(Item item) {
        for (Item i : this.store) {
            if (i.getName() == item.getName()) {
                int quantity = i.getQuantity();
                this.store.remove(i);
                this.store.add(new Item(item.getName(), quantity - item.getQuantity()));
                break;
            }
        }
    }
    
}
