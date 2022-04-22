import java.util.*;
class sumof_java
{
    public static void main(String afe[])
    {
             
        int num=135;
        int n=num,sum=0;
        sum=sum+n%10;   //143    3 rem
        n=n/10;
        
        sum=sum+n%10;
        num=num/10;
        sum=sum+n%10;

        System.out.println("sum the no:"+sum);
        /*Scanner  sc;
        sc= new Scanner(System.in);
        num = sc.nextInt();
        while()*/

        
    }
}