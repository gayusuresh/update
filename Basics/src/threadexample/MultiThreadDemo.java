package threadexample;

public class MultiThreadDemo extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
		System.out.println("hai");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
		
	}

	public static void main(String[] args) {
		MultiThreadDemo m=new MultiThreadDemo();
		
		m.start();
		m.setName("First");
		m.setPriority(MAX_PRIORITY);
		System.out.println(m.getName());
		System.out.println(m.getPriority());
		try
		{
			m.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		MultiThreadDemo m1=new MultiThreadDemo();
		
		m1.start();
		m1.setName("Second");
		System.out.println(m1.getName());
		m1.setPriority(MIN_PRIORITY);
		System.out.println(m1.getPriority());


	}

}
