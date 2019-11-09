package abstr;

public class ShapeMAin {
public static void main(String args[])
{
	Shape c=new Circle(2.5f);
	c.calcArea();
	Shape t=new Triangle(1.0f,6.0f);
	t.calcArea();
}
}
