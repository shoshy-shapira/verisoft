package Verisoft.OCP_order;

public class Order {

    private double totalPrice;
    public Order(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    // Apply a fixed discount
    public double applyDiscount() {
        double discount = 50; // Fixed discount of $50
        return totalPrice - discount;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
}
