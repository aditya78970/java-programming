import java.util.*;

class constructor{
    int sno;
    String sname;
    float marks;
    char grade;
    constructor()  //constructor
    {
        sno=1;
        sname="aditya";
        marks=70;
        
    }
    constructor(int sno,String sname,float marks){
        this.sno=sno;
        this.sname=sname;
        this.marks=marks;
    }
    /*void getinput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Student sname :");
        sname=sc.nextLine();
        System.out.println("enter the Student no :");
        sno=sc.nextInt();
        System.out.println("enter the Student marks :");
        marks=sc.nextFloat();
        
    }*/
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
        constructor s1=new constructor(20,"adi",70);
        //s1.getinput();
        s1.calcGrade();
        s1.display();

        constructor s2=new constructor();
        s2.calcGrade();
        s2.display();
    }
}