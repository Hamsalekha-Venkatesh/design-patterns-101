package java.org.modernjava.builder;


public class PhoneBuilder {
    private String make;
    private String model;
    private double price;
    private int qty;
    public PhoneBuilder make(String make) {
        this.make = make;
        return this;
    }

    public PhoneBuilder model(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder price(double price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder qty(int qty) {
        this.qty = qty;
        return this;
    }

    public Phone build() {
        return new Phone(make, model, price, qty);
    }
}