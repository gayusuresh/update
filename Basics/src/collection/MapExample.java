package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		TreeMap <Integer,String>map=new TreeMap<Integer,String>();
		map.put(5, "five");
		map.put(1, "one");
		map.put(2, "two");
		map.put(1, "one");
		map.put(3, "three");
		map.put(4, "four");
		System.out.println(map);

	}

}
