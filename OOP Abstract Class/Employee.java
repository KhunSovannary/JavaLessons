package home;

public abstract class Employee {
	private int id;
	private String name;
	public Employee() {
		id=1;
		name="sok san";
	}
	public Employee(int i,String n) {
		setId(i);
		setName(n);
		
	}
	public void setId(int i) {id=i; }
	public void setName(String n) {name=n; }
	public int getId() { return id;}
	public String getName() { return name; }
	
	public abstract String type();
	public abstract double getSalary();
	
	public String toString() {
		return getId()+"     "+getName();
				
	}
	

}
