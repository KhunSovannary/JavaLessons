package home;

public class FullTime extends Employee{
	private double salary;
	public FullTime() {
		super();
		salary=500;
	}
	public FullTime(int i,String n,double s) {
		super(i,n);
		setSalary(s);
	}
	public void setSalary(double s) {salary=s;}
	

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Full Time";
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	public String toString() {
		return super.toString()+"   "+getSalary()+"    "+type()+"\n";
	}

}
