package home;

public class Commission extends Employee{
	private double base;
	private double rate;
	private double amount;
	
	public Commission() {
		super();base=200;
		rate=0.02;
		amount=10000;
	}
	public Commission(int i,String n,double b,double r,double a) {
		super(i,n);
		setBase(b);
		setRate(r);
		setAmount(a);
	}
	public void setBase(double b) {base=b; }
	public void setRate(double r) {rate=r; }
	public void setAmount(double a) {amount=a;}
	public double getBase() {return base; }
	public double getRate() {return rate; }
	public double getAmount() {return amount;}
	
	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Commission ";
	}
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return getBase()+(getAmount()*getRate());
	}
	public String toString () {
		return super.toString()+"    "+getSalary()+"    "+type()+"\n";
	}
	

}
