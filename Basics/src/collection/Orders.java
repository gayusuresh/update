package collection;

public class Orders 
{
	private int orderid;
	private int nooforders;
	private int noofproducts;
	public Orders()
	{
		
	}
	
	
	public Orders(int orderid, int nooforders, int noofproducts) {
		super();
		this.orderid = orderid;
		this.nooforders = nooforders;
		this.noofproducts = noofproducts;
	}

	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getNooforders() {
		return nooforders;
	}
	public void setNooforders(int nooforders) {
		this.nooforders = nooforders;
	}
	public int getNoofproducts() {
		return noofproducts;
	}
	public void setNoofproducts(int noofproducts) {
		this.noofproducts = noofproducts;
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", nooforders=" + nooforders + ", noofproducts=" + noofproducts + "]";
	}


}
