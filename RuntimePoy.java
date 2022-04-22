class Account
{
    int accno;
    String name;
    float savingamount;
    float Currentamount;
    public Account(int accno,String name,float savingamount,float Currentamount)
    {
        this.accno=accno;
        this.name=name;
        this.savingamount=savingamount;
        this.Currentamount=Currentamount;
    }
    void display()
    {
        System.out.println("wages :"+accno);
        System.out.println("wages :"+name);
        System.out.println("wages :"+savingamount);
        System.out.println("wages :"+Currentamount);
    }


}
class Savings extends Account
{    
    
    public Savings(int accno,String name,float savingamount,float Currentamount)
    {
        super(accno,name,savingamount,Currentamount);

    }
    
    void display()
    {
        System.out.println("wages :"+accno);
        System.out.println("wages :"+name);
        System.out.println("wages :"+savingamount);
    }
}
class Current extends Account
{
    Current(int accno,String name,float savingsamount,float Currentamount)
    {
        super(accno, name,savingsamount,Currentamount);
    }
    void display()
    {
        if(Currentamount<1000)
        {
            System.out.println("amount less then 1000 ,cannot have account less then 1000");
        }
        else{
            System.out.println("wages :"+accno);
        System.out.println("wages :"+name);
        System.out.println("wages :"+Currentamount);

        }
    }
}


public class RuntimePoy {

    public static void main(String asq[]) {
        Account a1=new Account(1,"narayan",1234,2134);
        a1.display();
        Account a2=new Savings(2,"narayan",1234,3214);
        a2.display();
        Account a3=new Current(3,"narayan",23234,32);
        a3.display();

        
    }
    
}
