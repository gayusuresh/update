package abstractionTask;

public class Circle extends Shape
{
	int radius;
	public Circle()
	{
		
	}
public Circle(int radius)
{
	this.radius=radius;
}
public Circle(String color, boolean filled,int radius)
{
	super(color,filled);
	this.radius=radius;
}
public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}
@Override
public double getArea() {
	// TODO Auto-generated method stub
	return 3.14*radius*radius;
}
@Override
public double getPerimeter() {
	// TODO Auto-generated method stub
	return 2*3.14*radius;
}
@Override
public String toString() {
	return super.toString()+"Circle [radius=" + radius + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
}


}
