package abstraction;

public class Dog implements Animal
{

	@Override
	public void eat() {
		System.out.println("Dog eat more food");
		
	}

	@Override
	public void sleep() {
		System.out.println("Dog sleep more time");
		
	}
	

}
