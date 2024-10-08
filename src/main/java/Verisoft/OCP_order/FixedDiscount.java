package Verisoft.OCP_order;

public class FixedDiscount implements  DiscountStrategy{
    private Double discount=30.0;

    @Override
    public double ApplyCount(Double totalPrice) {
        return totalPrice-discount;
    }
}
