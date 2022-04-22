import java.util.*;

class compound
{
    public static void main(String asd[])
    {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter the principle");
        double principle=sc.nextInt();
        System.out.println("enter the rate");
        int rate=sc.nextInt();
        System.out.println("enter the time");
        int time=sc.nextInt();
        System.out.println("enter the n");
        int n=sc.nextInt();

        double amount= principle* Math.pow((1+rate/n),n*time);
        System.out.println("amount to pay"+amount);
    }
}