import java.util.Scanner;
import java.util.*;

class MinimumAccount extends Exception
{
    String message;

    public MinimumAccount(String message)
    {
        this.message=message;
    }
    @Override
    public String toString()
    {
        return message;
    }
}
public class ExceptionHandler
{
    static double current_bal=100;

    public static void main(String ghu[]) throws MinimumAccount
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter amount to withdrawal");
      int n=sc.nextInt();
      try 
          {
            if(current_bal<n)
            {
                throw new MinimumAccount("Insufficient funds ! your Current balance is " + current_bal);
            }
            else
            {
                System.out.println("Please Take The Money : " + n);
            }
          }
       catch (MinimumAccount mab) {
           mab.printStackTrace();
          //TODO: handle exception
      }  
    }
}