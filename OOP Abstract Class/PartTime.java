package home;

public class PartTime extends Employee{
	private double hour;
	private double rate;
	public PartTime() {
		super();
		hour=100;
		rate=18.0;
	}
	public PartTime(int i,String n,double h,double r) {
		super(i,n);
		setHour(h);
		setRate(r);
	}
	public void setHour(double h) {hour=h; }
	public void setRate(double r) {rate=r; }
	public double getHour() { return hour; }
	public double getRate() { return rate ;}
	
	

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Part Time";
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return getHour()*getRate();
	}
	public String toString() {
		return super.toString()+"    "+getSalary()+"      "+type()+"\n";
	}
	

}
