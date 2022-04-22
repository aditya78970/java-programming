/*Declare a student class, Get user input for the class instance variables and pass it to constructor of the class and print the values.
*/
class Student{
    public int rno;
    public String name;
    public Student(int r,String n)
    {
        rno=r;
        name=n;
    }
    public void display(){    
    System.out.println("rno:"+rno);
    System.out.println("rno:"+name);

    }

}
public class Day7Question1 {
    public static void main(String asq[])
{
    Student s1=new Student(1,"aditya");
    s1.display();
}    
}
