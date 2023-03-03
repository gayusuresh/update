package arraysexample;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		int cube=0;
		for(int i=0;i<size;i++)//0<3 1<3 2<3
		{
			a[i]=sc.nextInt();//2,3,4
			cube=cube+(a[i]*a[i]*a[i]);//sum=0+2=2 sum=2+3=5 sum=5+4=9
		}
		System.out.println("The sum =:"+cube);//9

	}

}
