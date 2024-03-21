package java.org.modernjava.builder;

import java.org.modernjava.java_generics.Printer;

public class MainBuilder {
    public static void main(String[] args) {
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        Phone p = phoneBuilder.make("Apple")
                .model("XR")
                .qty(10)
                .price(1000d)
                .build();
    }
}
