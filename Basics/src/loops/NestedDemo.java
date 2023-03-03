package loops;

public class NestedDemo {

	public static void main(String[] args) {
		for(int row=1;row<=3;row++)//1<=3 2<=3 3<=3 4<=3=f
		{
			for(int col=1;col<=3;col++)//col=1<=3 2<=3 3<=3 4<=3=f
				                       //col=1<=3 2<=3 3<=3
				                       //col=1<=3 2<=3 3<=3
			{
				System.out.print(col);//1 2 3
				                      //1 2 3
				                      //1 2 3
			}
			System.out.println();//nextline
		}

	}

}
