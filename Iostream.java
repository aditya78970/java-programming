import java.io.*;
public class Iostream {
    public static void main(String asq[]) //throws IOException
    {
        
    try{
    BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
    String name=b1.readLine();
    System.out.println(" "+name);
    String year =b1.readLine();
    int y=Integer.parseInt(year);
    y+=10;
    System.out.println(" "+y);
    }
    catch(IOException ie)
    {
        System.out.println(ie.getMessage());
    }
    /*catch(NumberFormatException ie)
    {
        System.out.println("String not allowed for year");
    }
*/
    } 


}
