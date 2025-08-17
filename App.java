package LambadaExpression;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter = () -> System.out.println("Hello World");
		greeter.greet();
		Displayer displayer = (name) -> System.out.println("Hello " + name);
		displayer.display("Omakar");
	}
}
