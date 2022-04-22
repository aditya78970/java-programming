import java.util.Scanner;



public class leap {
    public static void main(String asw[]){
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year:");
        year=sc.nextInt();
        if(year%4==0 && year%100!=0)
        {
            System.out.println("year  is leap year:");
        }
        else if(year%400==0)
        {
            System.out.println(" leap year:");
        }
        else
        {
            System.out.println("not leap year:");
        }

    }
    
}
