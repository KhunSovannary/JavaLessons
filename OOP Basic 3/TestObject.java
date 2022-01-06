import javax.swing.JOptionPane;
class TestObject{
	private OrderProduct op;
	String readString(String l){
		return JOptionPane.showInputDialog(l);
	}

	int readInt(String l){
		return Integer.parseInt(readString(l));
	}

	double readDouble(String l){
		return Double.parseDouble(readString(l));
	}

	void out(String m){
		JOptionPane.showMessageDialog(null,m);
	}

	public TestObject(){
       /* op=new OrderProduct();
	out(op.toString());*/
	/*
	op=new OrderProduct(2,"XYZ",100,20.5);
	out(op.toString());*/
	int c=readInt("Enter Code");
	String n=readString("Enter Name");
	int q=readInt("Enter Qty");
	double u=readDouble("Enter Unitprice");
	op=new OrderProduct(c,n,q,u);
	out(op.toString());

	}
	public static void main(String []args){
        new TestObject();
	}

}