package conditionalstatemnts;

public class NestedIfDemo {

	public static void main(String[] args) 
	{
		int i=0,j=2;
		if(i<j)//0<2
		{
			if(i==0)//inner
			{
				System.out.println("i value zero");
			}
			else
			{
				System.out.println("i value not equal to zero");
			}
		}
		else
		{
			System.out.println("i value not less than j");
		}
	}

}
