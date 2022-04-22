package StudentOne;

public class StudentOne {
    int rno;
    String name;
    String classs;
    String section;
    public StudentOne(int rno,String name,String classs,String section)
    {
        this.rno=rno;
        this.name=name;
        this.classs=classs;
        this.section=section;
    }
    public void display()
    {
        System.out.println(rno);
        System.out.println(name);
        System.out.println(classs);
        System.out.println(section);
    }
    
}
