package lambadaexp;

public class Test {

	public static void main(String[] args) {
		Square s=(x)->
		{
			System.out.println(x*x);
			
		};
     s.calculate(6);
	}

}
