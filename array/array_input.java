import java.util.*;

public class array_input {
    
    public static void main(String main){
        int a;
        int arr[];
        arr =new int[4];
        int i=0;


        System.out.println("enter total no of elements:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        while(i<a)
        {
            arr[i]=sc.nextInt();
            i+=1;
        }
        while(i<a)
        {
            System.out.println("array:"+arr[i]);
            i+=1;
        }
    }
    
}
