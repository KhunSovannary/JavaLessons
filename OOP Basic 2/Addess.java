package home;

public class Addess {
	private String phone;
	private String email;
	

	public Addess() {
		this("012334455","sok@gmail.com");
	
	}
	public Addess(String p,String e) {
		setPhone(p);
		setEmail(e);
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	public String toString() {
		return getPhone()+","+getEmail();
	}
	

}
