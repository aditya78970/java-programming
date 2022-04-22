/*Implement interface concept for the shape program done earlier.*/
interface Shape
{
    double area();
    double peri();
}
class Rectangle implements Shape
{
    private double length;
    private double breath;

    public Rectangle(double length,double breath)
    {
        this.length=length;
        this.breath=breath;
    }
    @Override
    public double area()
    {
        return length*breath;
    }
    @Override
    public double peri()
    {
        return 2*(length*breath);
    }
}
class Circle implements Shape{
    private double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    @Override
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double peri()
    {
       return 2*Math.PI*radius; 
    }
}
public class ImplementShape {
    public static void main(String as[]) {
        double length = 2.0;
		double breadth = 3.0;
		Rectangle r = new Rectangle(length, breadth);

		System.out.println("Rectangle - Area: " + r.area());
		System.out.println("Rectangle - perimeter: " + r.peri());

		// Circle area and parameter
		double radius = 2.0;
		Circle c = new Circle(radius);
		System.out.println("Circle - Area: " + c.area());
		System.out.println("Circle - perimeter: " + c.peri());
    }
    
}
