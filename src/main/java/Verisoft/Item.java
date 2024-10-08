package Verisoft;

public class Item {
    private String name;
    private double price;

    // Constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    //Getter
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
}
