import java.util.Scanner;

class arr_avg 
{    

    public static void main(String main)
    {
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
        int count=0;
        while(i<a)
        {
            count+=arr[i];
            
            i+=1;
        }
        int avg=count/a;
        System.out.println("array avg :"+ avg);
    }
    
}
