package home;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestObject {
	private Student []st;
	Student getStudent() {
	int i=readInt("ID");
	String f=readString("Firstname");
	String l=readString("Lastname");
	int y=readInt("Year");
	String g=readString("Group");
	return new Student(i,f,l,y,g);
	}
	int readInt(String l) {
		return Integer.parseInt(readString(l));
	}
	String readString(String l) {
		return JOptionPane.showInputDialog(l);
	}
	void out(String m) {
	JTextArea d=new JTextArea(m,10,40);
	JOptionPane.showMessageDialog(null, d);

	}

	public TestObject() {
		String report="All Students \n";
		int n;
		n=readInt("Enter Number Student");
		st=new Student[n];
		for(int i=0;i<n;i++)
			st[i]=getStudent();
		for(Student s:st) report+=s.toString();
		out(report);
		
		
	}

	public static void main(String[] args) {
		new TestObject();

	}

}
