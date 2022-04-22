import java.util.Scanner;


public class fibonacci {
    public static int fibonaccino(int n)
{
    if(n==0)
    {
        return 0;
    }
    if(n==1)
    {
        return 1;
    }
    return fibonaccino(n-2)+fibonaccino(n-1);
}
    public static void main(String asw[])

    {
        int s;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter how many type you want to loop");
        s=sc.nextInt();
        for(int i=0;i<10;i++)
        {
            System.out.println(fibonaccino(i)+" ");
        }
        
        
        
        
    }
}
