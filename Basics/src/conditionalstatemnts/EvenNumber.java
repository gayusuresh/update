package conditionalstatemnts;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num1=sc.nextInt();
		if(num1%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}

	}

}
