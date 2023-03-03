package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MapExample {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the input");
		String A=sc.next();
		String B=sc.next();
		String C=sc.next();
		HashMap<String,List<String>>map=new HashMap<String,List<String>>();
		ArrayList <String>list=new ArrayList<String>();
		list.add("apple");
		list.add("aeroplane");
		list.add("ant");
		
		ArrayList <String>list1=new ArrayList<String>();
		list1.add("Ball");
		list1.add("Banana");
		list1.add("Bat");
		
		ArrayList <String>list2=new ArrayList<String>();
		list2.add("Car");
		list2.add("Cat");
		list2.add("Cap");
		
		map.put(A, list);
		map.put(B, list1);
		map.put(C, list2);
		System.out.println(map);

	}

}
