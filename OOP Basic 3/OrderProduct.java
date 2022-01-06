class OrderProduct{
	//data member
	private int code;
	private String name;
	private int qty;
	private double unitprice;
	//default constructor
	public OrderProduct(){
		this(1,"ABC",100,25.5);
	}
	//constrcutor with parameter
	public OrderProduct(int c,String n,int q, double u){
		setCode(c);
		setName(n);
		setQty(q);
		setUnitprice(u);
	}
	//accessor set
	public void setCode(int c){code=c; }
	public void setName(String n){name=n;}
	public void setQty(int q){qty=q;}
	public void setUnitprice(double u){unitprice=u;}
	//access get
	public int getCode(){return code;}
	public String getName(){ return name; }
	public int getQty(){ return qty;}
	public double getUnitprice(){ return unitprice;}
	//implements
	public double getPrice(){
	return getQty() * getUnitprice();
	}
	public String toString(){
		return getCode()+","+getName()+","+getQty()+","+getUnitprice()+","+getPrice();
	}


}