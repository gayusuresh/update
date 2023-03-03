package loops;

import java.util.Scanner;

public class ChoiceExample {

	public static void main(String[] args) 
	{
		String s;
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice");
		int choice=sc.nextInt();//1,2
		switch(choice)
		{
			case 1:System.out.println("Large");
			break;
			case 2:System.out.println("medium");
			break;
			case 3:System.out.println("small");
			break;
			
		}
		System.out.println("do u want to continue");
		s=sc.next();//yes
		}
		while(s.equals("yes"));
	}

}
