package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticDemo 
{

	public static void main(String[] args) throws ArithmeticException,InputMismatchException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
			int z=x+y;
			int z1=x*y;
			int z2=x/y;
			int z3=x-y;
			System.out.println(z);
			System.out.println(z1);
			System.out.println(z2);
			System.out.println(z3);
		
		

	}

}
