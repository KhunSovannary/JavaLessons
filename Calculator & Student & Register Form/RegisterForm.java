package form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;

public class RegisterForm extends JFrame{
	private Container c;
	private JLabel l1,l2,l3,l4,l5,l6,msg;
	private JTextField tfn,tfm;
	private ButtonGroup g;
	private JRadioButton ch1,ch2;
	private JComboBox jcb,jcb1,jcb2;
	private JButton bta,bte;
	private JTextArea d, tfa;
	private JScrollPane jsp;
	private JCheckBox jckb;
	void addEvent() {
		bta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jckb.isSelected()) {
					
				String m,n,gender,dob,add;
				n =tfn.getText().toString();
			    m = tfm.getText().toString();
			    //y = tfy.getText().toString();
			    gender ="";
			    if(ch1.isSelected())
			    	 gender="male";
			    if(ch2.isSelected())
			    	 gender="female";
			    dob = jcb.getSelectedItem().toString()+"/"+jcb1.getSelectedItem().toString()+"/"+
			    		 jcb2.getSelectedItem().toString();
			    add = tfa.getText();
			   
			   String s = "Name:"+ n+"\n"+ "Mobile:"+m+"\n"+"Gender:"+ gender+ "\n"+"DOB:"+dob+"\n"+"Address: "+add;
				 	d.append(s);
			
					//d.setFont(new Font("Serif", Font.ITALIC, 16));
					d.setLineWrap(true);
					d.setWrapStyleWord(true);
					msg.setText("Success");
				
				}
				else {
					msg.setText("Failed");
				}
			
			}
		
	});

}
	void exitEvent() {
		bte.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				

			
			}
		
	});

}
	void initUI() {
		c=getContentPane();
		c.setLayout(null);
		l1=new JLabel("Registration Form");
		l1.setBounds(150,30,150,20);
		c.add(l1);
		l2=new JLabel("Name");
		l2.setBounds(40,55,60,20);
		c.add(l2);
		tfn=new JTextField();
		tfn.setBounds(80,55,150,20);
		c.add(tfn);
		l3=new JLabel("Mobile");
		l3.setBounds(40,80,60,20);
		c.add(l3);
		tfm=new JTextField();
		tfm.setBounds(80,80,150,20);
		c.add(tfm);
		l4=new JLabel("Gender");
		l4.setBounds(40,105,60,20);
		c.add(l4);
		g=new ButtonGroup();
		ch1=new JRadioButton("Male");
		ch1.setBounds(85,105,80,20);
		c.add(ch1);
		ch2=new JRadioButton("Female");
		ch2.setBounds(165,105,80,20);
		c.add(ch2);
		g.add(ch1);
		g.add(ch2);
		l5=new JLabel("DOB");
		l5.setBounds(40,130,60,20);
		c.add(l5);
		jcb=new JComboBox();
		jcb.setBounds(100,130,50,20);
		c.add(jcb);	
		for(int i=1; i<32;i++ ) {
			jcb.addItem(i);
		}
		jcb1=new JComboBox();
		jcb1.setBounds(150,130,50,20);
		c.add(jcb1);
		for(int i=1; i<13;i++ ) {
			jcb1.addItem(i);
		}
		jcb2=new JComboBox();
		jcb2.setBounds(200,130,55,20);
		c.add(jcb2);
		for(int i=1997; i<LocalDateTime.now().getYear();i++ ) {
			jcb2.addItem(i);
		}
		//c.add(jcb2);
		l6=new JLabel("Address");
		l6.setBounds(30,155,60,20);
		c.add(l6);
		tfa=new JTextArea();
		//tfa.setSize(200,240);
		tfa.setBounds(85,155,150,30);
		c.add(tfa);
		jckb= new JCheckBox();
		jckb.setText("Accept Terms and Condition");
		jckb.setFocusable(true);
		jckb.setBounds(50,200,200,50);
		c.add(jckb);
		bta=new JButton("Submit");
		bta.setBounds(100,250,80,20);
		c.add(bta);
	    bte=new JButton("Reset");
	    bte.setBounds(200,250,80,20);
	    c.add(bte);
	    d=new JTextArea();
	    jsp=new JScrollPane(d);
	    jsp.setBounds(300,40,250,200);
	    c.add(jsp);	
	    msg= new JLabel();
		msg.setBounds(50,350,80,20);
		c.add(msg);
		
	}
    void initForm() {
    	setTitle("Register Form");
    	setSize(500,500);
    	setVisible(true);
    	setLocationRelativeTo(null);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    }
	public RegisterForm() {
		
		initUI();
		addEvent();
		exitEvent();
		initForm();
	}

	public static void main(String[] args) {
		
		new RegisterForm();
	}

}

