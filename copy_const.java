class complex
{
    double real,img;
    complex()
    {
        real=10;
        img=20;
    }
    complex(int real,int img)
    {
        this.real=real;
        this.img=img;
    }
    complex(complex c2)
    {
        this.real=real;
        this.img=img;
    }
}
public class copy_const {
    public static void main(String ase[])
    {
        complex c1=new complex();
        complex c2=new complex(10,20);
        complex c3=new complex(c2);   //copy constructor

        System.out.println();
    }
    
}
