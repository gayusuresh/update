package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListSort {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(17);
		list.add(13);
		list.add(12);
		list.add(90);
		list.add(23);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
