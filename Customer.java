/*Declare a customer class with cid and cname, inherit a class called retailcustomer with creditcardnumber
Inherit another class wholesalecustomer from customer class with accno.declare constructor in subclasses 
and initialise the values. display the values using display method Create objects and invoke the 
respective methods
*/
class Customer1{
    int cid;
    String cname;
    public Customer1(int cid,String cname)
    {
        this.cid=cid;
        this.cname=cname;
    }
    void display()
    {
        System.out.println("Val1 = " + cid);
        System.out.println("Val2 = " + cname);
    }


}
class retailcustomer extends Customer1{
    int creditcardnumber;
    retailcustomer(int cid,String cname,int creditcardnumber)
    {
        super(cid,cname);
        this.creditcardnumber=creditcardnumber;
    }
    void display()
    {
        System.out.println("Val1 = " + cid);
        System.out.println("Val2 = " + cname);
        System.out.println("Val3 = " + creditcardnumber);
    }


}
class wholesalecustomer extends Customer1{
    int accno;
    wholesalecustomer(int cid,String cname,int accno)
    {
        super(cid, cname);
        this.accno=accno;
    }
    void display()
    {
        System.out.println("Val1 = " + cid);
        System.out.println("Val2 = " + cname);
        System.out.println("Val3 = " + accno);
    }
}
public class Customer {
    public static void main(String args[]) {
        
        Customer1 cs=new Customer1(21,"adi");
        cs.display();
        Customer1 cs1=new retailcustomer(21,"adi",3421);
        cs1.display();
        Customer1 cs2=new wholesalecustomer(21,"adi",1234);
        cs2.display();


    }
    
}
