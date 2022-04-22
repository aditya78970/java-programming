class A
{
    int a1;
    int b1;
    private A()
    {
        a1=1;
        b1=2;
    }
    A(int a,int b)
    {
        this();   //constructor chaining
    }
}
class private_const
{
    public static void main(String ase[])
    {
        A objA=new A(100,200);

        System.out.println(objA.a1 + objA.b1);
    }
}