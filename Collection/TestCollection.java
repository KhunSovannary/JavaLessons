package home;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestCollection {
	private ArrayList<String> l;
	void out(String m) {
		JTextArea d=new JTextArea(m,10,50);
		JOptionPane.showMessageDialog(null,d);
		
	}
	void input() {
		l.add("Sok");
		l.add("Dara");
		l.add("Kong");
		l.add(0,"RUPP");
		l.set(1,"Kong Vong");
		l.remove(1);
		
	}
	void output() {
		out(l.toString());
		
	}

	public TestCollection() {
		l=new ArrayList<String>();
		input();
		output();
	
	}

	public static void main(String[] args) {
	new TestCollection();
	}

}
