package Verisoft.OCP_order;

public class PercentageDiscount implements DiscountStrategy{
    double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double ApplyCount(Double totalPrice) {
        return totalPrice - (totalPrice * (percentage / 100));
    }
}
