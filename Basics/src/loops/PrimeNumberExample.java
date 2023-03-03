package loops;

import java.util.Scanner;

public class PrimeNumberExample {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();//6
		int fact=0;
		for(int start=1;start<=num;start++)//1<=6 2<=6 3<=6 4<=6 5<=6 6<=6
		{
			if(num%start==0)//6%1==0 6%2==0 6%3==0 6%4==0 6%5==0 6%6==0
			{
				fact++;//4
			}
		}
		if(fact==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("composite number");
		}

	}

}
