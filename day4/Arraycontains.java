import java.util.*;
public class Arraycontains {
    public static void main(String aq[])
    {
        int arr[]={1,2,3,4,6,8};
        System.out.println("Enter the element you wanted to search:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(a==arr[i]){
                count=arr[i];
            }

        }
        if(count==a){
            System.out.println("present");
        }
        else{
            System.out.println("not present");
        }
        
    }
    
}
