package abstr;

public class Circle extends Shape{
float radius,area;
final static float PI=3.141f;
Circle()
{
	
}
Circle(float radius)
{
	this.radius=radius;
}
public void calcArea()
{
	area=PI*radius*radius;
	System.out.println("Area of Circle is"+area);
}
}
