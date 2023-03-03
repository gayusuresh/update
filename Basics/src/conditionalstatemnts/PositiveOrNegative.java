package conditionalstatemnts;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num1=sc.nextInt();
		if(num1>0)
		{
			System.out.println("positive number");
		}
		else
		{
			System.out.println("number is negative");
		}

	}

}
