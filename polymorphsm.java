class Employee
{
    int eno;
    String ename;
    Employee()
        {
            eno=0;
            ename=null;
        }
    Employee(int eno,String ename)
    {
        this.ename=ename;
        this.eno=eno;
    }
    
    void calculatesal()                   //to override method in sub class it should be present in super class
    {
        System.out.println("this is for calc wadges");
    }
}
class regularemployee extends Employee{ 
    double basic;
    double da;
    double pf;
    regularemployee()
    {
        basic=3000;
        da=20;
        pf=40;
    }
    regularemployee(int eno,String ename,double basic,double da,double pf)
    {
        super(eno,ename);
        basic=3000.0;
        da=20.0;
        pf=40.0;
    }
    void calculatesal()
    {
        double salary=basic+da-pf;
        System.out.println("the monthly income of"+eno+ ename+" "+salary);
    }
}
class dailywagesemployee extends Employee
{
    int noofhrs;
    double wagesperhrs;
    dailywagesemployee(int eno,String ename,int noofhrs,double wadgesperhrs)
    {
        super(eno,ename);
        this.noofhrs=noofhrs;
        this.wagesperhrs=wagesperhrs;

    }
    void calculatesal()   //overriding super class
    {
        double wages=noofhrs*wagesperhrs;
        System.out.println("wages :"+wages);
    }
}
public class polymorphsm {
    public static void main(String asq[])
    {
        /*Employee e1=new Employee(12,"adi");
        e1.calculatesal();

        regularemployee r1= new regularemployee(12,"adi",3000,20,19);
        r1.calculatesal();

        dailywagesemployee d1=new dailywagesemployee(12,"adi",3000,20,19);
        d1.calculatesal();
*/
       Employee e1=new regularemployee(12,"adi",3000,20,19);
       e1.calculatesal();
    }
    
}
