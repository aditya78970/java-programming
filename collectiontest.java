import java.util.*;
class Student
{
    int id;
    String name;
    Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public String toString()
    {
        return(id+" "+name);
    }
}
class collectiontest
{
    public static void main(String asq[]) {
        ArrayList<Student> stlist=new ArrayList<Student>();

        Student s1=new Student(101,"Abhi");
        Student s2=new Student(102,"Abhi2");
        Student s3=new Student(103,"Abhi3");

        stlist.add(s1);
        stlist.add(s2);
        stlist.add(s3);

        Iterator itr=stlist.iterator();
        //Student s=new Student();
        while(itr.hasNext())//iterating
        {
            
            for(Student s:stlist);
            System.out.println(s);
        }

        
    }

    
}