import java.util.*;

public class count {
    public static void main(String asw[])
    {
        String s;
        int letter=0;
        int space=0;
        int num=0;
        int other=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        s=sc.nextLine();
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isLetter(ch[i])){
                letter++;
            }
            else if(Character.isDigit(ch[i]))
            {
                num++;
            }
            else if(Character.isSpaceChar(ch[i]))
            {
                space++;
            }
            else{
                other++;
            }
        }
    System.out.println("The string is :"+s);
    System.out.println("letter: " + letter);
    System.out.println("space: " + space);
    System.out.println("number: " + num);
    System.out.println("other: " + other);

    }

}
    

