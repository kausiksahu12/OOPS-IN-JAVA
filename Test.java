package Oopsjava;

public class Test {

    // Static block
    static {
        System.out.println("Static block is executed");
    }

    // Constructor
    public Test() {
        System.out.println("Constructor is executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method is executed");

        // Creating object, which calls the constructor
        Test obj = new Test();
    }
}
