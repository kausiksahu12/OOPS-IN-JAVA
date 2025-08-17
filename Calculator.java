package LambadaExpression;
public class Calculator {
	public static void main(String[] args) {
        Calculator1 add = (n1, n2) -> n1 + n2;
        Calculator1 sub = (n1, n2) -> n1 - n2;
        Calculator1 mul = (n1, n2) -> n1 * n2;
        Calculator1 div = (n1, n2) -> {
            if (n2 == 0) {
                System.out.println("Cannot divide by zero!");
                return 0;
            }
            return n1 / n2;
        };
        double a = 15, b = 3;
        System.out.println("Addition: " + add.calculate(a, b));
        System.out.println("Subtraction: " + sub.calculate(a, b));
        System.out.println("Multiplication: " + mul.calculate(a, b));
        System.out.println("Division: " + div.calculate(a, b));
    }
}

