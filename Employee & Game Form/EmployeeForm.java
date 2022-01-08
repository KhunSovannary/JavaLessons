package home;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EmployeeForm extends JFrame{
	private Container c;
	private JLabel l1,l2,l3,l4;
	private JTextField tfi,tfn;
	private JRadioButton ch1,ch2;
	private ButtonGroup g;
	private JButton bt;
	private JTextArea d;
	

	public EmployeeForm() {
		initUI();
		addEvent();
		initForm();
	}
	void addEvent() {
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String i,n,g="",result;
				i=tfi.getText();
				n=tfn.getText();
				if(ch1.isSelected()) g="Male";
				if(ch2.isSelected()) g="Female";
				result=i+"    "+n+"    "+ g +"\n";
				d.append(result);
				
	
			}
			
		});
		
	}
	void initUI() {
	c=getContentPane();
	c.setLayout(null);
	l1=new JLabel("Employee Form");
	l1.setBounds(150,30,100,20);
	c.add(l1);
	l2=new JLabel("ID");
	l2.setBounds(80,60,60,20);
	c.add(l2);
	tfi=new JTextField();
	tfi.setBounds(145,60,150,20);
	c.add(tfi);
	l3=new JLabel("Name");
	l3.setBounds(80,85,60,20);
	c.add(l3);
	tfn=new JTextField();
	tfn.setBounds(145,85,150,20);
	c.add(tfn);
	l4=new JLabel("Gender");
	l4.setBounds(80,110,60,20);
	c.add(l4);
	g=new ButtonGroup();
	ch1=new JRadioButton("Male");
	ch1.setBounds(145,110,80,20);
	c.add(ch1);
	ch2=new JRadioButton("Female");
	ch2.setBounds(230,110,80,20);
	c.add(ch2);
	g.add(ch1);
	g.add(ch2);
	bt=new JButton("Add");
	bt.setBounds(80,140,60,20);
	c.add(bt);
	d=new JTextArea();
	d.setBounds(80,170,220,100);
	c.add(d);
	
	
	
	
	
	}
	void initForm() {
		setSize(400,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new EmployeeForm();
	}

}
