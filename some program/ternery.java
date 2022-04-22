import java.util.Scanner;

class ternery
{
public static void main(String argv[])
{
int a,b;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
int greater=(a>=b)?a:b;
System.out.println("greater no:"+greater);

}

}