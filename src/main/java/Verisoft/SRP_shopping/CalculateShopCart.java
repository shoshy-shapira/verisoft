package Verisoft.SRP_shopping;

public class CalculateShopCart {

    // Calculate the total price of items in the cart
    public double calculateTotalPrice(ShoppingCart cart) {
        double total = 0;
        for (Item item : cart.getItems()) {
            total += item.getPrice();
        }
        return total;
    }
}
