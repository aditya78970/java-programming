import java.util.*;

public class ReverseString {
    
    public static void main(String asq[])
    {
        String s;
        String str="";
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        s=sc.nextLine();
        
        for(int i=s.length()-1;i>=0;i--)
        {            
            str=str+s.charAt(i);
        }
        System.out.println("original string: "+s);
        System.out.println("reversed string: "+str);



    }
    
}
