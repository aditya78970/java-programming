

interface Shape
{
    double pi=3.14;
    default void display()
    {
        System.out.println("shape interface");
    }
    static void regular()
    {
        System.out.println("regular shape");
    }
    void area();
}
class Circle implements Shape{
    public void area(){
        System.out.println(pi*10*10);
    }
}
public class interfaceImplementaton  
{

    public static void main(String asq[])
    {
        Shape s;
        s=new Circle();
        s.display();
        Shape.regular();
        s.area();
    }
        
    

}