package conditionalstatemnts;

public class Demo {

	public static void main(String[] args) {
		int num1=110,num2=12;
		if(num1<num2)
		{
			System.out.println("num1 is less than");
		}
		else if(num2<num1)
		{
			System.out.println("num2 is less than");
		}
		else
		{
			System.out.println("both choice is false");
		}
	}

}
