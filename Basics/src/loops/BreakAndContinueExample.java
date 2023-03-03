package loops;

public class BreakAndContinueExample {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)//1<=10,2<=10 3<=10,4<=10
		{
			if(i==4)//1==4 2==4--4==4
			{
				continue;
			}
			System.out.println(i);//1,2,3
		}

	}

}
