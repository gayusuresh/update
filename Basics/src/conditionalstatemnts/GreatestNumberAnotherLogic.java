package conditionalstatemnts;

import java.util.Scanner;

public class GreatestNumberAnotherLogic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three number");
		int num1=sc.nextInt();//4
		int num2=sc.nextInt();//8
		int num3=sc.nextInt();//2
		int max=num1;//max=4
		
		if(max<num2)//4<8
		{
			max=num2;//max=8
		}
		if(max<num3)//8<2
		{
			max=num3;//
		System.out.println("The max value is"+max);//8

	}

}}
