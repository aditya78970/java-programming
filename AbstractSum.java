abstract class Sum{
    public abstract int sumoftwo(int n1,int n2);
    public abstract int sumofthree(int n1,int n2,int n3);

    public void dsp(){
        System.out.println("method of class sum:");

    }

}
class demo extends Sum{
    public int sumofthree(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    @Override
    public int sumoftwo(int n1, int n2) {
        // TODO Auto-generated method stub
        return n1+n2;
    }
}
public class AbstractSum {
    public static void main(String asq[])
    {
        Sum obj=new demo();
        System.out.println(obj.sumoftwo(2, 3));
        System.out.println(obj.sumofthree(1, 3, 2));
        obj.dsp();
    }

    
}
