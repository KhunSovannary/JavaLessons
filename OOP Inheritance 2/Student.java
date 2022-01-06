package home;

public class Student extends Person{
	private int id;
	private int year;
	private  String group;
	public Student() {
		super(); //call default constructor super class 
		id=1;
		year=3;
		group="A1";
	}
	public Student(int i,String f,String l,int y,String g) {
		super(f,l);//call constructor super class with parameter
		setId(i);
		setYear(y);
		setGroup(g);
	}
	public void setId(int i) {id=i;}
	public void setYear(int y) {year=y; }
	public void setGroup(String g) {group=g; }
	public int getId() { return id; }
	public int getYear() { return year; }
	public String getGroup() { return group;}
	
	public String toString() {
		String t=super.toString();//call toString() super class
		return getId()+","+t+","+getYear()+","+getGroup()+"\n";
	}
	
	

}
