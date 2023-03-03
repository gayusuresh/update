package loops;

import java.util.Scanner;

public class FactorsExample {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();//5
		int start=1;
		//1<=5 2<=5 3<=5 4<=5 5<=5
		do
		{
			if(num%start==0)//5%1==0,5%2==0 5%3==0 5%4==0
				//5%5==0
			{
				System.out.println(start);//1,5
			}
			start++;///2,3,4,5
		}
		while(start<=num);

	}

}
