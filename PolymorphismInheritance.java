/*Implement inheritance and polymorphism with Employee and Manager classes*/

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
    
    void display()                   //to override method in sub class it should be present in super class
    {
        System.out.println("this is for calc wadges");
        System.out.println(""+eno);
        System.out.println(""+ename);
    }
}
class manager extends Employee()
{
    String city;
    manager()
    {
        super(int eno,String ename);
        city="delhi";
    }
    manager(int eno,String ename,String city)
    {
        super(int eno,String ename);
        this.city=city;
    }
    void display()                   //to override method in sub class it should be present in super class
    {
        System.out.println("this is ");
        System.out.println(""+eno);
        System.out.println(""+ename);
        System.out.println(""+city);
    }


}
public class PolymorphismInheritance {

    public static void main(String asq[])
    {
        Employee e1=new Employee();
        e1.display();
        Employee e3=new Employee(1,"narayan");
        e1.display();
        Employee e2=new manager();
        e2.display();
        Employee e4=new manager(1,"aditya","delhi");
        e2.display();


    }
    
}
