package home;

public class Employee {
	//data member
	private int id;
	private String name;
	private double hour;
	private double rate;
	
    //default contructor
	
	public Employee() {
		id=1;
		name="sok san";
		hour=100;
		rate=15.0;
		
	}
	//constructor with parameter
	public Employee(int i,String n,double h,double r) {
		setId(i);
		setName(n);
		setHour(h);
		setRate(r);
	}
	//acccsor set
	public void setId(int i) {id=i; }
	public void setName(String n) {name=n;}
	public void setHour(double h) {hour=h; }
	public void setRate(double r) {rate=r;}
	//accessor get
	public int getId() { return id;}
	public String getName() { return name;}
	public double getHour() { return hour; }
	public double getRate() { return rate;}
	//implement method
	
	public double getSalary() {return getHour() * getRate();}
	
	public String toString() {
		return getId()+","+getName()+","+getHour()+","+getRate()+","+
	    getSalary();
	
	}

}
