package Verisoft;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    // Add an item to the cart
    public void addItem(Item item) {
        items.add(item);
    }

    // Get all items in the cart
    public List<Item> getItems() {
        return items;
    }
}
