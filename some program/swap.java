import java.util.*;

class swap
{

    public static void main(String ase[]) 
    {
        int a,b;
        
        System.out.println("enter first no:");
        Scanner sc= new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("enter second no:");
        b=sc.nextInt();

        
        int temp;
        temp=a;
        a=b;
        b=temp;
                
        /*a=a+b;
        b=a-b;
        a=a-b;
        */System.out.println("swap no a:"+a +" \n b:"+b);
        

    }
} 

