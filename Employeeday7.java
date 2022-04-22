import java.util.*;
class Employee{
            int eno;
	        String ename;
	        float grosssalary;
	        float netsalary;
	        float pfdeduction;
    Employee()
        {
            
        }
    public void getinput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Employee name: ");
	    ename= sc.nextLine();
	    System.out.print("Enter the Emplyee no: ");
	    eno= sc.nextInt();
	    
	    System.out.print("Enter the Gross Saalary: Rs. ");
	    grosssalary= sc.nextFloat();
    }
    void salary()
    {
        pfdeduction=(grosssalary/100)*10;
        netsalary=grosssalary-pfdeduction;
    }
    public void display() {
        System.out.println("actual net income:"+netsalary);
    }
    
}
public class Employeeday7 {
    public static void main(String asq[])
    {
        Employee e1=new Employee();
        e1.getinput();
        e1.salary();
        e1.display();
    }
    
}
