package java.org.modernjava.java_generics;

public class Printer <T> {
    private T member;
    public Printer(T member) {
        this.member = member;
    }

    public void printT() {
        System.out.println(this.member);
    }

    public <T, V, F> void shout(T someVar, V some2, F otherType) {
        System.out.print(someVar + "!!!");
    }
}
