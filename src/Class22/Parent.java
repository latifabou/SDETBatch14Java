package Class22;

public class Parent {
    static void print(){
        System.out.println("Hello World");
    }
}
class Child extends Parent{
    static void print(){
        System.out.println("Hello there");
    }
}
class TestP{
    public static void main(String[] args) {
        Child.print();
    }
}