package home;

public class Employee extends Person {
	private int id;
	private double hour;
	private double rate;
	public Employee() {
		super();
		id=1;
		hour=100;
		rate=15.0;
	}
	public Employee(int i,String f,String l,double h,double r) {
		super(f,l);
		setId(i);
		setHour(h);
		setRate(r);

	}
	public void setId(int i) {id=i;}
	public void setHour(double h) {hour=h; }
	public void setRate(double r) {rate=r;}
	public int getId() { return id;}
	public double getHour() { return hour; }
	public double getRate() {return rate; }
	public double getSalary() {
		return getHour() * getRate();
	}
	public String toString() {
		String t=super.toString();
		return getId()+","+t+","+getHour()+","+getRate()+","+
				getSalary()+"\n";
		
		
	}
	

}
