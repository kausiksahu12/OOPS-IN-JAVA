package PolyPackage;

public class PoluMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new circlearea();
		Circle sq = new square();
		Circle rect = new rectangle();
		
		deatils(circle);
		deatils(sq);
		deatils(rect);
	}
	
	public static void deatils(Circle ref) {
		ref.Acceptinput();
		ref.calculateArea();
		ref.displayArea();
		System.out.println();
	}
}

