package home;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Example1 extends JFrame{
	private Container c;
	private JPanel p1,p2,p12,p3,p123,p4;
	private JTextField  tfn,tfa,tfc,tfs;
	private JTextArea tan,dis;
	private JButton bts,btc;
	
	
	public void initUI() {
		c=getContentPane();
		p1=new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(new JLabel("Employee Form"));
		//c.add(p1,"North");
		p2=new JPanel();
		p2.setLayout(new GridLayout(4,2));
		p2.add(new JLabel("Name"));
		p2.add(tfn=new JTextField(30));
		p2.add(new JLabel("Age"));
		p2.add(tfa=new JTextField(30));
		p2.add(new JLabel("City"));
		p2.add(tfc=new JTextField(30));
		p2.add(new JLabel("SSN"));
		p2.add(tfs=new JTextField(30));
		p4=new JPanel();
		p4.setLayout(new FlowLayout());
		p4.add(new JLabel("Note"));
		p4.add(tan=new JTextArea(5,30));
		JPanel p24=new JPanel();
		p24.setLayout(new BorderLayout());
		p24.add(p2,"North");
		p24.add(p4,"Center");
		p12=new JPanel();
		p12.setLayout(new BorderLayout());
		p12.add(p1,"North");
		p12.add(p24,"Center");
		p3=new JPanel();
		p3.setLayout(new FlowLayout());
		p3.add(bts=new JButton("Save"));
		p3.add(btc=new JButton("Cancel"));
		p123=new JPanel();
		p123.setLayout(new BorderLayout());
		p123.add(p12,"North");
		p123.add(p3,"Center");
		
		
		c.add(p123,"North");
		c.add(new JScrollPane(dis=new JTextArea(10,30)),"Center");
		

		
	}
    public void initForm() {
    	//setSize(400,400);
    	pack();
    	setVisible(true);
    	setLocationRelativeTo(null);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
	public Example1() {
		initUI();
		initForm();
		
	}

	public static void main(String[] args) {
		new Example1();
	}

}
