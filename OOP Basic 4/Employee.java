package home;

public class Employee extends Person {
	private Contact con;
	private int id;
	private double salary;
	public Employee() {
		super();
		con=new Contact();
		id=1;
		salary=1200;
	}
	public Employee(int i,String f,String l,String p,String e,double s) {
		super(f,l);
		con=new Contact(p,e);
		setId(i);
		setSalary(s);
	}
	public void setId(int i) {id=i; }
	public void setSalary(double s) {salary=s; }
	public int getId() { return id; }
	public double getSalary() { return salary;}
	public String toString() {
		String t=super.toString();
		return getId()+"  "+t+"   "+con.toString()+"   "+getSalary()+"\n";
	}
	
	

}
