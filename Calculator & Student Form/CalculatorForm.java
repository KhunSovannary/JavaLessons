package home;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorForm extends JFrame{

	private JLabel l1,l2,l3,l4;
	private Container c;
	private JTextField tfa,tfb,tfr;
	private JButton bt1,bt2,bt3,bt4;
	void divEvent() {
		bt4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double a,b,s;
				a=Double.parseDouble(tfa.getText().toString().trim());
				b=Double.parseDouble(tfb.getText().toString().trim());
				if(b==0) s=0;
				else s=a/b;
				tfr.setText(s+"");
				
			}
			
		});
		
		
	}
	void mulEvent() {
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double a,b,s;
				a=Double.parseDouble(tfa.getText().toString().trim());
				b=Double.parseDouble(tfb.getText().toString().trim());
				s=a*b;
				tfr.setText(s+"");
				
			}
			
		});
		
		
	}
	void subEvent() {
		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double a,b,s;
				a=Double.parseDouble(tfa.getText().toString().trim());
				b=Double.parseDouble(tfb.getText().toString().trim());
				s=a-b;
				tfr.setText(s+"");
				
			}
			
		});
		
		
	}
	void sumEvent() {
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double a,b,s;
				a=Double.parseDouble(tfa.getText().toString().trim());
				b=Double.parseDouble(tfb.getText().toString().trim());
				s=a+b;
				tfr.setText(s+"");
				
			}
			
		});
	
	}
	void initUI() {
		c=getContentPane();
		c.setLayout(null);
		l1=new JLabel("Calculator !");
		l1.setBounds(150,30,100,20);
		c.add(l1);
		l2=new JLabel("Value A");
		l2.setBounds(100,60,60,20);
		c.add(l2);
		tfa=new JTextField();
		tfa.setBounds(165,60,150,20);
		c.add(tfa);
		l3=new JLabel("Value B");
		l3.setBounds(100,85,60,20);
		c.add(l3);
		tfb=new JTextField();
		tfb.setBounds(165,85,150,20);
		c.add(tfb);
		l4=new JLabel("Result");
		l4.setBounds(100,105,60,20);
		c.add(l4);
		tfr=new JTextField();
		tfr.setBounds(165,105,150,20);
		c.add(tfr);
		bt1=new JButton(" + ");
		bt1.setBounds(50,130,60,20);
		c.add(bt1);
		bt2=new JButton(" - ");
		bt2.setBounds(115,130,60,20);
		c.add(bt2);
		bt3=new JButton(" * ");
		bt3.setBounds(170,130,60,20);
		c.add(bt3);
		bt4=new JButton(" / ");
		bt4.setBounds(240,130,60,20);
		c.add(bt4);
		
	}
	void initForm() {
		setSize(400,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public CalculatorForm() {
	
	initUI();
	
	sumEvent();
	subEvent();
	mulEvent();
	divEvent();
	
	initForm();	
	}

	public static void main(String[] args) {
		new CalculatorForm();
		
	}

}

