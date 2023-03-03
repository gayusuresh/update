package task;

import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class Source {
	 public static String x,y;
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		ArrayList<String>list=new ArrayList<String>();
		
		validate a=(x, y)->
		{
			 x=sc.next();
			 y=sc.next();
			 list.add(x);
			 list.add(y);
			System.out.println(x.matches("ABC")&&(y.matches("DEF")));
			return true;
		};
     try {
		a.isValid(x, y);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     boolean isValid = list.stream().anyMatch(element -> element.contains("ABC"));
     System.out.println(isValid);
	}

}
