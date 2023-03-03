package arraysexample;

import java.util.Scanner;

public class DiagonalElementsExample {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and col");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)//0<2 1<2
		{
			for(int j=0;j<col;j++)//0<2 1<2 2<2=f
				                 //0<2 1<2
			{
				if(i==j)//0==0 0==1 1==0 1==1
				{
					System.out.print(a[i][j]);//1 s
					                          //s  7
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
