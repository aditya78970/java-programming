interface emp {
    void getput(String name,String year,String address);
    void display();

}
class Employee implements emp{
    String name;
    String year;
    String address;
    public void getput(String name,String year,String address){
        this.name=name;
        this.year=year;
        this.address=address;
    }
    public void display()
    {
        System.out.println(name+" "+year+" "+address);
        //System.out.println(year);
        //System.out.println(address);

    
    }
}
    
    class Interface1 {
        public static void main(String asq[])
        {
            Employee E1=new Employee();
            E1.getput("adi","1995","pune");
            E1.display();
            Employee E2=new Employee();
            E2.getput("adi","1995","pune");
            E1.display();
            Employee E3=new Employee();
            E3.getput("adi","1995","pune");
            E1.display();


        }
    
}
