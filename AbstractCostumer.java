import java.util.Scanner;

abstract class Customer{
    String sname;
    int CusNo;
    int retailprize;
    int itemQuantity;
    Scanner sc=new Scanner(System.in);
    public abstract void getinput();
    public abstract void display();
    public abstract int order();

}
class retailcustomer extends Customer{
    int retailprize;
    int itemQuantity;
    //Scanner sc=new Scanner(System.in);
    public void getinput()
    {
        
        
        //Scanner sc=new Scanner(System.in);
        System.out.println("enter item quantity:");
        itemQuantity=sc.nextInt();
        System.out.println("enter retail prize:");
        retailprize=sc.nextInt();
        

    }
    public void display()
    {
        System.out.println("Itemquantity :"+ itemQuantity);
        System.out.println("Itemquantity :"+ retailprize);
        
        //System.out.println("tatal value for the purchase is:");
        

    }
    public int order()

    {
        Scanner cc=new Scanner(System.in);
        System.out.println("name of the custmer:");
        sname=cc.nextLine();
        System.out.println("custumer no:");
        CusNo=cc.nextInt();
        int sum=itemQuantity*retailprize;
        return sum;
        //System.out.println("tatal value for the purchase is:");
        
    }

}
class wholesalecustomer extends Customer{
    
    public void getinput()
    {
        System.out.println("enter item no:");
        itemQuantity=sc.nextInt();
        System.out.println("enter value no:");
        retailprize=sc.nextInt();
    }
    public void display()
    {
        System.out.println("Itemquantity :"+ itemQuantity);
        System.out.println("Itemquantity :"+ retailprize);
    }
    public int order()
    {
        System.out.println("name of the custmer:");
        sname=sc.nextLine();
        System.out.println("custumer no:");
        CusNo=sc.nextInt();

        int sum=itemQuantity*retailprize;
        return sum;
    }

}
public class AbstractCostumer {
        public static void main(String asq[])
        {
            Customer ab=new retailcustomer();
            Customer abs=new wholesalecustomer();
            ab.getinput();
            ab.display();
            System.out.println(ab.order());
        }

    
}
