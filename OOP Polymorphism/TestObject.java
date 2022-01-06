package home;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestObject {
	private Object x;
	void out(String m) {
		JTextArea d=new JTextArea(m,10,40);
		JOptionPane.showMessageDialog(null, d);
		
	}

	public TestObject() {
		String report=" ";
		x=new Person();
	    report+=x.toString()+"\n";
	    x=new Student();
	    report+=x.toString();
	    out(report);
		
	}

	public static void main(String[] args) {
		new TestObject();

	}

}
