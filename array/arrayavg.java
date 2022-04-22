import java.util.*;
public class arrayavg {
    public static void main(String asw[])
    {
        int arr[]={1,2,3,4,6,8};
        System.out.println("avg of array:");
        Scanner sc=new Scanner(System.in);
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            count+=arr[i];

        }
        System.out.println(count/2);
    }
    
}
