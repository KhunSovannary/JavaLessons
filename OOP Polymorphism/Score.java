package home;

public class Score {
	private int sub1;
	private int sub2;
	private int sub3;
	private int sub4;
	private int sub5;
	

	public Score() {
		sub1=80;
		sub2=90;
		sub3=70;
		sub4=100;
		sub5=80;
		
	}
	public Score(int s1,int s2,int s3,int s4,int s5) {
		setSub1(s1);
		setSub2(s2);
		setSub3(s3);
		setSub4(s4);
		setSub5(s5);
	}
	public void setSub1(int s1) {sub1=s1;}
	public void setSub2(int s2) {sub2=s2;}
	public void setSub3(int s3) {sub3=s3;}
	public void setSub4(int s4) {sub4=s4;}
	public void setSub5(int s5) {sub5=s5;}
	public int getSub1() {return sub1; }
	public int getSub2() { return sub2; }
	public int getSub3() { return sub3; }
	public int getSub4() { return sub4; }
	public int getSub5() { return sub5; }
	
	public int getTotal() {
		return getSub1()+getSub2()+getSub3()+getSub4()+getSub5();
		
	}
	public String getGrade() {
		double av=getTotal()/5;
		String g=" ";
		if(av>=85) g="A";
		else if (av>=80) g="B";
		else if(av>=70) g="C";
		else if(av>=60) g="D";
		else if(av>=50) g="E";
		else g="F";
		return g;
	}
	public String toShowscores() {
		return getSub1() +","+getSub2()+","+getSub3()+","+getSub4()+","+getSub5();
	}
	public String toString() {
		return toShowscores()+"   "+getTotal()+"   "+getGrade();
	}
	
	

}
