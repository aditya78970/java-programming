class GenericTwoVariable
{
    public static void main(String asq[])
    {
     TwoGenerics<Integer,String> obj=new TwoGenerics<Integer,String>(32,"hahah");
     obj.showType(); 
     int integerValue=obj.getob1();
     System.out.println("the given integer is: "+integerValue);
     String str=obj.getob2();
     System.out.println("the given String is: "+str);

    }
}
class TwoGenerics<T,V>
{
    T ob1;
    V ob2;
    TwoGenerics(T ob1,V ob2)
    {
        this.ob1=ob1;
        this.ob2=ob2;
    }
    T getob1()
    {
        return ob1;
    }
    V  getob2()
    {
        return ob2;
    }
    void showType()
    {
        System.out.println("type of t is:"+ob1.getClass().getName());
        System.out.println("type of t is:"+ob2.getClass().getName());
    }
}