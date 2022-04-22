import java.util.*;
class addtwo_no
{
public static void main(String argv[])
{
    int num1,num2,num3;
    System.out.println("enter the value of first");
    Scanner sc;    //decleraton dont allocate memory 
    sc=new Scanner(System.in);       //allocating memory for the object
    num1=sc.nextInt();
    System.out.println("enter the value second");
    num2=sc.nextInt();

    num3=num1+num2;
    System.out.println("answer: \n"+num3);



}   
}
