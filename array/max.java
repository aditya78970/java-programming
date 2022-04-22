
import java.util.*;



public class max {
    public static void main(String ax[]){
        int max=0,a;
        int[]  arr=new int[10];
        System.out.println("enter total no of element:");

        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int i=0;
        while(i<a){
            arr[i]=sc.nextInt();
            i+=1;
        }
        i=0;
        while(i<a){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max element is:"+max);
    }
    
}
