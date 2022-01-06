package home;

public class Contact {
	private String phone;
	private String email;
	public Contact() {
		phone="012223344";
		email="sok@gmail.com";
		
	}
	public Contact(String p,String e) {
		setPhone(p);
		setEmail(e);
	}
	public void setPhone(String p) {phone=p; }
	public void setEmail(String e) {email=e; }
	public String getPhone() { return phone; }
	public String getEmail() { return email; }
	public String toString() {
		return getPhone()+"    "+getEmail();
	}

}
