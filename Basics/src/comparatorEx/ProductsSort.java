package comparatorEx;

import java.util.Comparator;

public class ProductsSort implements Comparator<Orders>
{

	@Override
	public int compare(Orders o1, Orders o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getNoofproducts(), o2.getNoofproducts());
	}

}
