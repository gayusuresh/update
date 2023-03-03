package loops;

public class LeftTriangleExample {

	public static void main(String[] args) {
		for(int row=1;row<5;row++)//row=1<5 2<5 3<5 4<5 5<5
		{
			for(int col=1;col<=row;col++)//1<=1 2<=1
				                         //1<=2 2<=2 3<=2=f
				                         //1<=3 2<=3 3<=3
				                        //1<=4 2<=4 3<=4 4<=4
				                       //1<=5 2<=5 3<=5 4<=5 5<=5
			{
				System.out.print("*");//*
				                     //* *
				                     //* * *
				                     //* * * * 
				                     //* * * * *
			}
			System.out.println();
			
		}

	}

}
