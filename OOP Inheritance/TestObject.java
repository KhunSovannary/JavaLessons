package home;

import javax.swing.JOptionPane;

public class TestObject{
	private Employee e;
	
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
    	JOptionPane.showMessageDialog(null, m);
    }
	public TestObject() {
		String result="";
		//create default object
		e=new Employee();
		
		result+=e.toString();
		//create object Assign value
		
		e=new Employee(2,"kong","long",120,15.0);
		result+=e.toString();
		//create object input from keyboard
		
		int id=readInt("Enter ID");
		String f=readString("Enter First name");
		String l=readString("Enter Last name");
		double h=readDouble("Hour");
		double r=readDouble("Rate");
		
		e=new Employee(id,f,l,h,r);
		result+=e.toString();
		
		
		out(result);
		
		
	
	}

	public static void main(String[] args) {
	new TestObject();

	}

}
