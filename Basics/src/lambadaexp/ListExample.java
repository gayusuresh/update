package lambadaexp;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(45);
		list.add(78);
		list.add(90);
		list.add(67);
		for(Integer i:list)
		{
			System.out.println(i);
		}
		System.out.println("================");
		list.forEach(
		
		(n)->System.out.println(n)
		);


	}

}
