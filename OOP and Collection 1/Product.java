package home;

public class Product {
	private int code;
	private String name;
	private double price;

	public Product() {
		code=1;
		name="ABC";
		price=12.34;
		
	}
	public Product(int c,String n,double p) {
		setCode(c);
		setName(n);
		setPrice(p);
	}
	public void setCode(int c) {code=c; }
	public void setName(String n) {name=n; }
	public void setPrice(double p) {price=p; }
	
	public int getCode() {
		return code;
	}
	public String getName() { return name; }
	public double getPrice() {return price; }
	public String toString() {
		return getCode()+"  "+getName()+"    "+
	    getPrice()+"\n";
	}

}
