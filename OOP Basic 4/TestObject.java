package home;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestObject {
	private Employee e[];
	
	String readString(String l ) {
		return JOptionPane.showInputDialog(l);
		
	}
	int readInt(String l) {
		return Integer.parseInt(readString(l));
	}
	
	double readDouble(String l) {
		return Double.parseDouble(readString(l));
	}
	
	void out(String l) {
		JTextArea d=new JTextArea(l,10,40);
		JOptionPane.showMessageDialog(null, d);
		
	}
	
	Employee getEmployee() {
		int id=readInt("ID");
		String f=readString("Firstname");
		String l=readString("Last name");
		String p=readString("Phone");
		String e=readString("Email");
		double s=readDouble("Salary");
		return new Employee(id,f,l,p,e,s);
	}
	public TestObject() {
		String report=" All Employees \n";
		int numberemployee;
		numberemployee=readInt("Enter number employee");
		e=new Employee[numberemployee];
		for(int i=0;i<numberemployee;i++)
			e[i]=getEmployee();
		for(Employee e1:e) report+=e1.toString();
		out(report);
			
		
	}
	public static void main(String []args) {
		new TestObject();
	}

}
