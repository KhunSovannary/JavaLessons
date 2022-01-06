package home;

import javax.swing.JOptionPane;

public class TestObject {
	private Employee e,e1;
	void out(String m) {
		JOptionPane.showMessageDialog(null, m);
	}

	public TestObject() {
		
		e=new Employee();
		e1=new Employee(2,"Chan Tola",120,12.0);
		out(e.toString()+"\n"+e1.toString());
		
		
	}

	public static void main(String[] args) {
		new TestObject();
		
	}

}
