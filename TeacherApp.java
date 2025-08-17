package Oopsjava;

public class TeacherApp {
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "Helen";
		t.mA();
		t.teach();
		PhysicsTeacher pt = new PhysicsTeacher();
		pt.name ="Rutu";
		pt.teach();
		pt.dLEx();
		ChemistryTeacher ch = new ChemistryTeacher();
		ch.name = "Tulu";
		ch.teach();
		ch.dChEx();
		BiologyTeacher bt = new BiologyTeacher();
		bt.name = "palo";
		bt.teach();
		bt.dDiEx();
	}

}
