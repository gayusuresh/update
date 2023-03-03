package threadexample;


public class SingleThreadExample extends Thread
{
public void run()
{
	System.out.println("hai");
}
	public static void main(String[] args)
	{
		SingleThreadExample s=new SingleThreadExample();
		s.start();

	}

}
