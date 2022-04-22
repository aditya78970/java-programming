import java.util.*;

class Student{
    int sno;
    String sname;
    float marks;
    char grade;

    void getinput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Student sname :");
        sname=sc.nextLine();
        System.out.println("enter the Student no :");
        sno=sc.nextInt();
        System.out.println("enter the Student marks :");
        marks=sc.nextFloat();
        
    }
    void calcGrade()
    {
        if(marks>=80){
            grade='a';
        }
        else if(marks>=70)
        {
            grade='b';
        }
        else
        {
            grade='c';
        }
    }
    void display()
    {
        System.out.println("student detail are:");
        System.out.println("no:"+sno);
        System.out.println("name:"+sname);
        System.out.println("marks:"+marks);
        System.out.println("grade:"+grade);
    }
    
}
class teststudent{
    public static void main(String asr[])
    {
        Student s1=new Student();
        s1.getinput();
        s1.calcGrade();
        s1.display();

        Student s2=new Student();
        s2.sno=2;
        s2.sname="siddhi";
        s2.marks=70;
        s2.calcGrade();
        s2.display();
    }
}