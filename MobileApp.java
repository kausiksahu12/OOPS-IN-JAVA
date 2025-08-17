package Oopsjava;

public class MobileApp {

	public static void main(String[] args) {
		Mobile m = new Mobile("Samsung", 52000);
		System.out.println("Mobile Details: " + m.brand+" " + m.costs);
		System.out.println("OS Details : " + m.o.name+" "+m.o.version);
		m.o.operate();
		
		Charger c = new Charger("Samsung", 60);
		m.ref = c;
		System.out.println("CHARGER DETAILS: " + m.ref.brand+" " + m.ref.watts);
		m.ref.charge();
		
		m=null;
		System.out.println("Mobile losts");
		System.out.println("Charger details: ");

	}

}
