package arraysexample;

import java.util.Arrays;

public class DeepCopyTwoDArrayExample {

	public static void main(String[] args) {
		int a[][]= {{1,1},{2,2}};
		/*a[0][0]=1;
		a[0][1]=1;
		a[1][0]=2;
		a[1][1]=2;*/
		int b[][]=new int[2][2];
	
		for(int i=0;i<a.length;i++)//0<2 1<2
		{
			for(int j=0;j<a[i].length;j++)//0<2 1<2 2<2=f
				                         ////0<2 1<2 2<2=f
			{
				b[i][j]=a[i][j];//a[0][0]=1 a[0][1]=1
				                 //a[1][0]=2 a[1][1]=2
			}
		}
		a[0][0]++;
		System.out.println("b data");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.println(b[i][j]);
			}
		}
		System.out.println("a data");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[i][j]);
			}
		}


	}

}
