package java.org.modernjava.builder;

public class Phone {
    private String make;
    private String model;
    private double price;
    private int qty;

    public Phone(String make, String model, double price, int qty) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.qty = qty;
    }
}
