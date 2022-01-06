package home;
import java.util.*;

import javax.swing.*;

public class TestCollection {
	private ArrayList<Product> list;
	void showProduct() {
		String report="All Products\n";
		for(Object x:list) report+=x.toString();
		out(report);
	}
	void addToList() {
		do {
		list.add(getProduct());
		}while(readString("Yes or No ?").equalsIgnoreCase("yes"));
		
	}
	Product getProduct() {
		int c=readInt("Code");
		String n=readString("Name");
		double p=readDouble("Price");
		return new Product(c,n,p);
		
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
		JTextArea d=new JTextArea(m,10,45);
		JOptionPane.showMessageDialog(null, d);
		
	}
	

	public TestCollection() {
		list=new ArrayList<Product>();
		addToList();
		showProduct();
	
	}

	public static void main(String[] args) {
		new TestCollection();

	}

}
