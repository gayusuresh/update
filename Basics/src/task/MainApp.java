package task;

public class MainApp {

	
		static Integer fun(int[] arr, Integer len) {
		   Integer a;
		  if(len==1)
				  
		     return arr[0];
		else 
		    a=fun(arr,len-1);
		
		if(a<arr[len-1])
		   return a;
		else
		  return (arr[len-1]);
		}
		public static void main(String[] args) {
			int arr[]= {24,20,40,60};
			int val=MainApp.fun(arr, 4);
			System.out.println(val);

		}
	}


