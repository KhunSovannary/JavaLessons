package home;
import java.util.ArrayList;
import javax.swing.*;
public class TestCollection {
	private ArrayList<String>list;
	
	String readString(String l) {
		return JOptionPane.showInputDialog(l);
	}
	void out(String m) {
		JTextArea d=new JTextArea(m,10,50);
		JOptionPane.showMessageDialog(null, d);
		
		
	}
	void addData() {
		do {
			list.add(readString("Enter Name"));
		}while(readString("Yes or No?").equalsIgnoreCase("yes"));
	}
	void showData() {
		out(list.toString());
	}

	public TestCollection() {
		
		list=new ArrayList<String>();
		
		/*list.add("Sok");
		list.add("Dara");
		list.add("Chan");
		out(list.toString());
		list.add(1,"Hong");
		out(list.toString());*/
		addData();
		showData();
		
		
	}

	public static void main(String[] args) {
		new TestCollection();
	}

}
