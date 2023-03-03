package lambadaexp;

import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer>list= Arrays.asList(1,2,3,40);
		list.forEach((Integer x)->
		{
			int y=x+2;
			System.out.println(y);
		});
		
		

	}

}
