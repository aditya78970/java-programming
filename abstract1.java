abstract class Shape {
    abstract void area();
}
class Circle extends Shape{
    int radius;
    void area()
    {
        System.out.println("fff");
    }
}
public  class abstract1 {
    public static void main(String asq[])
    {
        Shape s1=new Circle();
        s1.area();
    }
    
}
