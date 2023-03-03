package arraysexample;

import java.util.Scanner;

public class TwoDArrayExample {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and col");
		int row=sc.nextInt();//2
		int col=sc.nextInt();//2
		
		int a[][]=new int[row][col];
		System.out.println("inputs");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("outputs");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
