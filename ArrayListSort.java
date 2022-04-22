import java.util.*;
class ArrayListSort

{
    public static void main(String asq[])
    {
        ArrayList<cla1> arr=new ArrayList<cla1>();
        arr.add(new cla1(10,20,"adi",11D));
        arr.add(new cla1(30,20,"adm",-2.1D));
        arr.add(new cla1(2,50,"weer",41D));
        arr.add(new cla1(32,50,"ebr",6D));
        arr.add(new cla1(57,1,"ru",4.1D));
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
    class cla1 implements Comparable<cla1>
    
    {
        int s;
        int s2;
        String s3;
        Double s4;
        cla1(int s,int s2, String s3,Double s4)
        {
            this.s=s;
            this.s2=s2;
            this.s3=s3;
            this.s4=s4;
        }
        public String toString()
        {
            return(s+" "+s2+" "+s3+" "+s4);
        }
        public int get1()
        {
            return s;
        }
        public int compareTo(cla1 cl1) 
        {
            int temp=cl1.get1();
            return this.s-temp;
        }
    }
