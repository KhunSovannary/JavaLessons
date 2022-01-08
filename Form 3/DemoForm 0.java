package home;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoForm extends JFrame{
	private Container c;
	private JLabel l1,l2,l3,l4,l5;
	private JTextField tfi,tfn,tfh;
	private JComboBox jcb;
	private JScrollPane jsp;
	private JTextArea d;
	private JButton bta,btc;
	
	void initUI() {
		c=getContentPane();
		c.setLayout(null);
		l1=new JLabel("Employee Form");
		l1.setBounds(150,30,200,20);
		c.add(l1);
		l2=new JLabel("ID");
		l2.setBounds(60,60,60,20);
		c.add(l2);
		tfi=new JTextField();
		tfi.setBounds(125,60,150,20);
		c.add(tfi);
		l3=new JLabel("Name");
		l3.setBounds(60,85,80,20);
		c.add(l3);
		tfn=new JTextField();
		tfn.setBounds(125,85,150,20);
		c.add(tfn);
		l4=new JLabel("Hour");
		l4.setBounds(60,110,80,20);
		c.add(l4);
		tfh=new JTextField();
		tfh.setBounds(125,110,150,20);
		c.add(tfh);
		l5=new JLabel("Rate");
		l5.setBounds(60,135,80,20);
		c.add(l5);
		jcb=new JComboBox();
		jcb.setBounds(125,135,150,20);
		c.add(jcb);
		jcb.addItem("15.0");
		jcb.addItem("20.0");
		jcb.addItem("25.0");
		jcb.addItem("30.0");
		d=new JTextArea();
		jsp=new JScrollPane(d);
		jsp.setBounds(60,160,300,100);
		c.add(jsp);
		bta=new JButton("Add");
		bta.setBounds(80,270,60,20);
		c.add(bta);
		btc=new JButton("Clear");
		btc.setBounds(150,270,60,20);
		c.add(btc);
		
		
		
		
		
		
	}
    void initForm(){
    	setSize(500,500);
    	setVisible(true);
    	setLocationRelativeTo(null);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	public DemoForm() {
		
	initUI();
	initForm();
		
	}

	public static void main(String[] args) {
		new DemoForm();
	
	}

}
