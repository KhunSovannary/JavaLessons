package home;

import javax.swing.JOptionPane;

public class TestObject {
	private Addess ad,ad1;
	public void out(String m) {
		JOptionPane.showMessageDialog(null, m);
	}

	public TestObject() {
		ad=new Addess();
		ad1=new Addess("0101122333","long vuthy");
		out(ad.toString()+"\n"+ad1.toString());
		
		
		
	}
	public static void main(String []args) {
		new TestObject();
		
	}

}
