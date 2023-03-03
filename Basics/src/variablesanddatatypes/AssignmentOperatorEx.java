package variablesanddatatypes;

import java.util.Scanner;

public class AssignmentOperatorEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1 and number 2");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		num1+=num2;//num1=num1+num2;
		System.out.println("Ans=:"+num1);
		num1-=num2;
		System.out.println("Ans=:"+num1);
		num1*=num2;
		System.out.println("Ans=:"+num1);
		num1/=num2;
		System.out.println("Ans=:"+num1);
		
		
		

	}

}
