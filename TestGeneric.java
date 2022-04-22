class classA<TE,TE1>
{
    TE a;
    TE1 b;
    classA(TE a,TE1 b)
    {
        this.a=a;
        this.b= b;

    }
    public TE add()
    {
        //int c=a+b;
        return a;
    }
}
public class TestGeneric {
    public static void main(String asq[])
    {
        classA<Integer,Float> obja=new classA<Integer,Float>(100,21.0F);
        //classA<String,Integer> objb=new classA<String,Integer>("welcome",20);
        //classA<Float,String> objc=new classA<Float,String>(100.9F,"good");
        System.out.println(obja.add());
        //System.out.println(objb.add());
        //System.out.println(objc.add());
    }
    
}
