import java.io.*;
public class CopyBytes {
    public static void main(String asq[]) throws IOException
    {
    FileInputStream in =null;
    FileOutputStream out=null;

    try
    {
        in=new FileInputStream("C:\Users\Aditya\OneDrive\Desktop\dac_java\day4\Arraycontains.java");
        out=new FileOutputStream("outagain.txt");
        int c;
        while((c=in.read())!=-1)
        {
            out.write(c);
        }
        
    }
    finally
    {
        if(in !=null)
        {
            in.close();

        }
        if(out !=null)
        {
            out.close();
        }
    }
    
    }
}
