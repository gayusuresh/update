package loops;

import java.util.Scanner;

public class EvenODDNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   int num=sc.nextInt();//5
		   int start=1;
		 int evencount=0,oddcount=0;
		   while(start<=num)
		   {
			   if(start%2==0)
			   {
				System.out.println("even number"+start);
			   }
			   else
			   {
					System.out.println("odd number"+start);
			   }
			   start++;
		   }
		  


	}

}
