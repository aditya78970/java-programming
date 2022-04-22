import java.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class tockenString {
    public static void main(String asew[])
    {
        String deli=",";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        StringTokenizer token=new StringTokenizer(s,deli);
        int count = token.countTokens();
        System.out.println("Number of tokens : " + count);
        while (token.hasMoreElements())
  
            //  Returning the next token
            // using nextElement() method
            System.out.println(token.nextElement());
        
    }
    
}
