package conditionalstatemnts;

import java.util.Scanner;

public class LeapYearExaample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		if(year%4==0)//
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println(" century leap year");
				}
				else
				{
					System.out.println("not leap year");
				}
				System.out.println("century year");
			}
			//System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}

	}

}
