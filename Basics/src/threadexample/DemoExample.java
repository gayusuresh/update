package threadexample;

public class DemoExample implements Runnable
{
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Hai");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		
	}
	public static void main(String[] args) {
		DemoExample d=new DemoExample();
		Thread t=new Thread(d);//new
		t.start();//runnable

	}

	

}
