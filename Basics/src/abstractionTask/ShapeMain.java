package abstractionTask;

public class ShapeMain {

	public static void main(String[] args) {
		Circle c=new Circle("red",true,34);
		System.out.println(c);
		Circle c1=new Circle();
		c1.setColor("green");
		System.out.println(c1.getColor());
        System.out.println(c1);
	}

}
