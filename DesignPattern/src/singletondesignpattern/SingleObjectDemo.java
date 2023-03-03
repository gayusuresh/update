package singletondesignpattern;

public class SingleObjectDemo 
{
	private static SingleObjectDemo instance = new SingleObjectDemo();
	private SingleObjectDemo()
	{
		
	}
	   public static SingleObjectDemo getInstance()
	   {
		      return instance;
	   }
	   
	   public void showMessage()
	   {
		   System.out.println("hello world");
	   }


}
