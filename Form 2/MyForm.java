package home;
import javax.swing.*;
import java.awt.*;
public class MyForm extends JFrame{
	private Container c;
	private JTextField tf1;
	private JRadioButton ch;
	private JButton bt;
	

	public MyForm() {
		c=getContentPane();
		c.setLayout(null);
		tf1=new JTextField();
		tf1.setBounds(50,100,300,20);
		c.add(tf1);
		ch=new JRadioButton("Male");
	    ch.setBounds(355,100,100,20);
	    c.add(ch);
		bt=new JButton("Add");
		bt.setBounds(50,125,100,20);
		c.add(bt);
		setTitle("Welcome to see my form");
		setSize(600,600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyForm();
	}

}
