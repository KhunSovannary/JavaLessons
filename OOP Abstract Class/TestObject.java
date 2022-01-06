package home;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestObject {
	
	
	
	char key(String m) {
		char ch;
	do {
		ch=readChar("choose in["+m+"]");
		
	}while(m.indexOf(ch)==-1);
	return ch;
	}
	
	char readChar(String l) {
		return readString(l).charAt(0);
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
	Employee getObject() {
		Employee e=null;
		int i=readInt("ID");
		String n=readString("Name");
		char ch=key("FfPpCc");
		switch(ch) {
		case 'F':case 'f':double s=readDouble("Salary");
		       e=new FullTime(i,n,s);break;
		case 'P':case 'p':double h=readDouble("Hour"); 
		double r=readDouble("Rate");e=new PartTime(i,n,h,r);break;
		case 'C':case 'c':
		double b=readDouble("Base");
		double rt=readDouble("Rate");
		double a=readDouble("Amount");
		e=new Commission(i,n,b,rt,a);break;
		          
		} return e;
		
	}
	
	public TestObject() {
		Employee e;
		String report="";
		do {
		e=getObject();
		report+=e.toString();
		}while(key("yn")=='y');
		
		out(report);
		
	}
	
	public static void main(String []args) {
		/*String report="";
		Employee e;
		e=new FullTime();
		report+=e.toString();
		e=new PartTime(1,"Dara",200,20.0);
		report+=e.toString();
		e=new Commission(2,"Long Tola",150,0.01,20000);
		report+=e.toString();
		System.out.println(report);*/
		new TestObject();
		
		
	}

}
