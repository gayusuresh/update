package exceptionhandling;

public class FinallyExample {

	public static void main(String[] args) {
		int i=9,j=0;
		try
		{
			int k=i/j;
			System.out.println(k);
			System.out.println("hai");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
        finally
        {
        	System.out.println("hello");
        }
	}

}
