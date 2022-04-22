import java.util.*; 
public class palindrome {

    public static void main(String asf[])
    {
        
        System.out.println("enter the no \n");
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int num=n;
        int rem;
        int s=0;
        while(num>0)
        {
            rem = num%10;
            s=s*10 + rem;
            num=num/10;


        }
        if(s==n)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }

    }
    
}
