import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistElement {
    public static void main(String asq[]) 
    {
        int ele;
        int a;
        int b;
        ArrayList<Integer> arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter sze of array");
        ele=sc.nextInt();
        for(int i=0;i<ele;i++)
        {
            a=sc.nextInt();
            arr.add(a);
        }
        System.out.println("enter ele"+arr);
        b=sc.nextInt();
        for(int i=0;i<arr.size();i++)
        {
            if(arr.contains(b))
            {
            System.out.println("present");
            System.exit(0);
            }
            
        }
        System.out.println("not present");

        
    }
    
}
