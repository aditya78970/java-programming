class methodclass
{
    private int data;
    void display() {
            class inner
            {
                void innerdiaplay()
                {
                    data=870;
                    System.out.println(data);
                }
            }
            inner i=new inner();
            i.innerdiaplay();
    }
}
class innerclass
{
    public static void main(String asw[])
    {
        methodclass me= new methodclass();
        me.display();
    }
}