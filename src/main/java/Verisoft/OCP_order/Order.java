package Verisoft.OCP_order;

public class Order {

    private double totalPrice;
    private DiscountStrategy discountStrategy;

    public Order(double totalPrice, DiscountStrategy discountStrategy) {
        this.totalPrice = totalPrice;
        this.discountStrategy = discountStrategy;
    }
    public double getTotalPrice() {
        return totalPrice;
    }

    public double getFinalPrice() {
        return discountStrategy.ApplyCount(totalPrice);
    }
}
