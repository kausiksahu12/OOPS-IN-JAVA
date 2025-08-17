package Oopsjava;

public class FAnApp {
	public static void main(String[] args) {
		Fan f1 = new Fan(4,"Crompton","RED");
		System.out.print(f1.NumberOfWings + " " + f1.brand + " " + f1.color);
		Fan f2 = new Fan();
		System.out.println(f2.NumberOfWings+ " " + f2.brand + " " + f2.color);
	}

}
