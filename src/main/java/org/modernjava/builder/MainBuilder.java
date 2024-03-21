package java.org.modernjava.builder;

public class MainBuilder {
    public static void main(String[] args) {
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        Phone p = phoneBuilder.make("Apple")
                .model("XR")
                .qty(10)
                .price(1000d)
                .build();

        retur
    }
}
