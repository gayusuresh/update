package loops;

public class ReverseTriangle {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)//1<=5 2<=5 3<=5 4<=5 5<=5
		{
			for(int j=5;j>=i;j--)//5>=1 4>=1 3>=1 2>=1 1>=1
				                 //5>=2 4>=2 3>=2 2>=2
				                  //5>=3 4>=3 3>=3
				                  //5>=4 4>=4
				                  //5>=5
			{
				System.out.print("*");//*****
				                      //****
				                      //***
				                      //**
				                      //*
			}
			System.out.println();
		}

	}

}
