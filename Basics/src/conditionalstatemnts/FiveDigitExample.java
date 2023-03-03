package conditionalstatemnts;

import java.util.Scanner;

public class FiveDigitExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the data");
		int num=sc.nextInt();
		if(num>=10000 &&num<=99999)
		{
			System.out.println("five digit number");
		}
		else
		{
			System.out.println("it is not a five digit number");
		}

	}

}
