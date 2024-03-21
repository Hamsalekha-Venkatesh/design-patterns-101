package java.org.modernjava.java_generics;

import java.util.Arrays;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {
        Printer<Integer> integerPrinter = new Printer<>(23);
        integerPrinter.printT();

        integerPrinter.shout("oops", 122, 333);
        //integerPrinter.shout(12223);

        printList(Arrays.asList(1, 2, 3,));
    }

    private static void printList(List<?> someList) {
        someList.forEach(System.out::print);
    }
}
