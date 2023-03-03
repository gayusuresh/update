package polymorphism;

public class OverMain {

	public static void main(String[] args) {
		OverExample o=new OverExample();
		System.out.println(o.add(4));
		System.out.println(o.add(3, 5));
		System.out.println(o.add(3.4f,7.8f,2.3f));

	}

}
