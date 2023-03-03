package stringsexample;

public class DemoExample {

	public static void main(String[] args) {
		String s="hello";//literal type
		String s1="Hello";
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		if(s==s1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
