class Person
{
    protected String name;
    protected int adhar;
    Person(String name,int adhar)
    {
        this.name=name;
        this.adhar=adhar;
    }
    String displayPrerson()
    {
        return (name+""+adhar);
    }
}
class Student extends Person
{
    int regno;
    String branch;
    String course;
    Student(String name,int adhar,int regno,String branch,String course) //from main to subclass
    {
        super(name, adhar); // from subclass to super class
        this.regno=regno;
        this.branch=branch;
        this.course=course;
    }
    public void display()
    {
        System.out.println(regno+" "+name+" "+branch+" "+adhar);
    }

}

/*class Employee extends Student{
    int empno;
    String designation,qualificaton;
    Employee(int empno,String designation,String qualification,String name,int adhar,int regno,String branch,String course)
    {
    Student(String name,int adhar,int regno,String branch,String course);

    this.empno=empno;
    this.designation=designation;
    this.qualificaton=qualificaton;
    }
    void displayEmployee{
        System.out.println(name+""+adhar+""+empno+""+designation+""+qualificaton);
    }
}
*/
public class Inheritance2 {               //non subclass in same package
    public static void main(String agsv[])
    {
        Person P1=new Person("raha",1234);
        String output=P1.displayPrerson();
        System.out.println(output);
        P1.name="Ashok";            //protected member can be accessed
        output=P1.displayPrerson();
        System.out.println(output); 
        Student s1=new Student("subhash",2341,321,"channai","btec");
        s1.display(); 
        Employee e1=new Employee();  

    }
    
    //in another package non subclass 
    
        
    
    
}
