package variablesanddatatypes;

import java.util.Scanner;

public class RelationalOperatorExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number 1 and number 2");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(num1>num2);
		System.out.println(num1>=num2);
		System.out.println(num1<num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);

	}

}
