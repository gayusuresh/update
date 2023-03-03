package classandobject;

public class Product
{
	private int productid;
	private String productname;
	private int nooforders;
	static int idgen=1001;
	public Product()
	{
		productid=idgen++;
	}
	
	public Product(String productname, int nooforders) {
		this();//default constructor
		
		this.productname = productname;
		this.nooforders = nooforders;
	}

	public void setProductId(int productid)
	{
		this.productid=productid;
	}
	public int getProductId()
	{
		return productid;
	}
	
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getNooforders() {
		return nooforders;
	}
	public void setNooforders(int nooforders) {
		this.nooforders = nooforders;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", nooforders=" + nooforders + "]";
	}
	

}
