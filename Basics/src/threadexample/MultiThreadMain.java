package threadexample;

public class MultiThreadMain {

	public static void main(String[] args) {
		Table t=new Table();
		First f=new First(t);
		f.setName("first");
		System.out.println(f.getName());
		
		f.start();
		Second s=new Second(t);
		s.setName("second");
		System.out.println(s.getName());
		s.start();
		
	}

}
