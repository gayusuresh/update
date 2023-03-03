package unittesting;

public class Calculation {
	public static int maxNum(int arr[])//1,2,3,4
	{
		int max=arr[0];//1
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<max)//1>1 2>1
			{
				arr[i]=max;//2=max
			}
		}
		return max;//4
	}

}
