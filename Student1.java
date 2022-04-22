class Student
{
        int roll_no;
        String name;
    public Student(){
        roll_no=2;
        name="john";
    }
    public void display()
    {
        System.out.println(roll_no+" "+name);
    }

}
public class Student1 {
    public static void main(String asq[])
    {       

        Student s1=new Student();
        s1.display();
    }
    
}
