class A
{
    private int a1;
    private float b1;

    //getter and setter method
    public void setA1(int a1)
    {
        this.a1=a1;
    }
    public int getA1()
    {
        return a1;
    }
    public void setB1(float b1)
    {
        this.b1=b1;
    }
    public float getB1()
    {
        return b1;
    }
}
public class get_set {
    public static void main(String ase[])
    {
        A s1=new A();
        s1.setA1(10);
        System.out.println(s1.getA1());

        s1.setB1(10);
        System.out.println(s1.getB1());


    }
    
}
