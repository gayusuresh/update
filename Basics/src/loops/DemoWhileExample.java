package loops;

import java.util.Scanner;

public class DemoWhileExample {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();//5
	   int start=1,sum=0;
	   while(start<=num)//1<=52<=53<=54<=55<=5
	   {
		   sum=sum+start;//sum=0+1 sum=1+2=3sum=3+3=6 sum=6+4=10 sum=10+5=15
		   start++;//2,3,4,5
	   }
	   System.out.println("The sum is"+sum);
		}

	}


