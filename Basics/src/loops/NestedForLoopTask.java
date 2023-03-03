package loops;

public class NestedForLoopTask {

	public static void main(String[] args) {
		 for(char i='A';i<='C';i++)//A<=C B<=C C<=C
		 {
			 for(char j='A';j<='C';j++)//A<=C B<=C C<=C
				                       //A<=C B<=C C<=C
			 {
				 System.out.print(i);//ABC
				                     //ABC
				                     //ABC
			 }
			 System.out.println();
		 }

	}

}
