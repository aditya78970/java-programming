class Student{
    int roll_no;
    String address;
    double phone;
    public Student(int roll_no,String address,double phone)
    {
        this.roll_no=roll_no;
        this.address=address;
        this.phone=phone;
    }
    public void display()
    {
        System.out.println(roll_no+" "+address+" "+phone);
    }
}
public class Student3 {
    public static void main(String asq[])
    {       

        Student s1=new Student(2,"pune",7364);
        Student s2=new Student(2,"delhi",21345);
        s1.display();
        s2.display();
    }
    
}
