import java.util.*;
class A{
    int a;
    A(){
        a=100;
    }
    public void display()
    {
        System.out.println(a);
    }

}
class B extends A
{
    int b;
    B()
    {
        super();
        b=200;
    }
    public void display()
    {
        super.display();
        System.out.println(a+b);
    }
}
public class inheritance {
    public static void main(String asw[])
    {
        A objA=new A();
        A objB=new B();
        objA.display();
        objB.display();
    }
}
