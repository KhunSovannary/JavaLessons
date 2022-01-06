package home;

import javax.swing.*;
import java.util.*;
public class TestEmployee {
	private Vector<Employee>list;
	Employee getEmployee() {
		int id=readInt("Enter ID");
		String name=readString("Enter Name");
		double salary=readDouble("Enter Salary");
		return new Employee(id,name,salary);
		
	}
	double readDouble(String l) {
		return Double.parseDouble(readString(l));
	}
	int readInt(String l) {
		return Integer.parseInt(readString(l));
	}
	String readString(String l) {
		return JOptionPane.showInputDialog(l);
	}
	void out(String m) {
		JTextArea d=new JTextArea(m,10,50);
		JOptionPane.showMessageDialog(null, d);
		
	}


	public TestEmployee() {
		list=new Vector<Employee>();
		addEmployee();
		showEmployee();
	}

	public static void main(String[] args) {
		new TestEmployee();

	}
	void showEmployee() {
		//out(list.toString());
		String report=" All Employee\n";
		for(Object e:list) report+=e.toString();
		out(report);
	}
	void  addEmployee() {
		do {
			list.add(getEmployee());
			
		}while(readString("Yes or No?").equalsIgnoreCase("yes"));
	}

}
