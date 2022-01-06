package home;

public class Student extends Person {
	private int id;
	private String group;
	private int year;
	private Score score;

	public Student() {
		super();
		id=1;
		group="A1";
		year=3;
		score=new Score();
		
		
	}
	public Student(int i,String f,String l,String g,int y,int s1,int s2,int s3,int s4,int s5) {
		super(f,l);
		setId(i);
		setGroup(g);
		setYear(y);
		score=new Score(s1,s2,s3,s4,s5);

	}
	public void setId(int i) {id=i; }
	public void setGroup(String g) {group=g ;}
	public void setYear(int y) {year=y; }
	public int getId() { return id; }
	public String getGroup() { return group; }
	public int getYear() { return year;}
	public Score getScore() { return score;}
	
	
	public String toString () {
		String t=super.toString();
		return getId()+"  "+t+"   "+getGroup()+"   "+getYear()+"  "+getScore().toString();
		
	}

}
