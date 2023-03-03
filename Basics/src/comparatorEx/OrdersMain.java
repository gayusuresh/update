package comparatorEx;

import java.util.Map;
import java.util.TreeMap;

public class OrdersMain {

	public static void main(String[] args) {
		Orders o1=new Orders(1004,23,99);
		Orders o2=new Orders(1002,25,299);
		Orders o3=new Orders(1001,22,199);
		ProductsSort p=new ProductsSort();
		TreeMap<Orders,Integer>map=new TreeMap<Orders,Integer>(p);
		map.put(o1,o1.getOrderid());
		map.put(o2,o2.getOrderid());
		map.put(o3,o3.getOrderid());
		for(Map.Entry<Orders, Integer>m:map.entrySet())
		{
			System.out.println(m);
		}

	}

}
