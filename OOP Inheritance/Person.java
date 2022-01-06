package home;

public class Person {
	private String firstname;
	private String lastname;
	public Person() {
		firstname="sok";
		lastname="chan";
	
	}
	public Person(String f,String l) {
		setFirstname(f);
		setLastname(l);
	}
	public void setFirstname(String f) {
		firstname=f;
	}
	public void setLastname(String l) {
		lastname=l;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String toString() {
		return getFirstname()+","+getLastname();
	}
	

}
