package lambadaexp;

public class DrawableMain 
{
	public static void main(String []args)
	{
		int width=10;
		Drawable d1=()->{
			System.out.println(width);
		};
		d1.draw();
			}

}
