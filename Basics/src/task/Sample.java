package task;

public class Sample {

	public static void main(String[] args) 
	{
		fun();
		
	}
	Integer fun(Integer arr[],Integer len)
	{
		Integer a;
		if(len == 1)
		{
			return arr[0];
		}
		else
		{
			a=fun(arr,len-1);
		}
		
		if(a<arr[len-1])
		{
			return a;
		}
		else
		{
			return arr[len-1];
		}
	}

}
