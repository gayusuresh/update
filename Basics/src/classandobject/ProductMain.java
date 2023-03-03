package classandobject;

public class ProductMain {

	public static void main(String[] args) {
		Product p1=new Product();
		
		p1.setProductname("chair");
		p1.setNooforders(23);
		System.out.println(p1.getProductId());
		System.out.println(p1.getProductname());
		System.out.println(p1.getNooforders());
		Product p2=new Product("kids chair",45);
		System.out.println(p2);
	}

}
