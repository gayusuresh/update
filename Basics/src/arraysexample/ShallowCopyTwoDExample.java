package arraysexample;

import java.util.Arrays;

public class ShallowCopyTwoDExample {

	public static void main(String[] args) {
		int a[][]= {{1,2},{3,4},{5,6}};
		int b[][]=a.clone();
		for(int temp[]:b)
		{
			System.out.println(Arrays.toString(temp));
		}
       a[0][0]++;
       System.out.println("====================A ");
       for(int temp[]:a)
		{
			System.out.println(Arrays.toString(temp));
		}
       System.out.println("==============B");
       for(int temp[]:b)
		{
			System.out.println(Arrays.toString(temp));
		}
	}

}
