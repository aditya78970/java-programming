import java.util.*;
public class pelindrom {
    public static void main(String s[])
    {
        String a;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter val:");
        a=sc.nextLine();
        int count=0;
        int startin=0;
        int endin=a.length()-1;
        while(startin<endin)
        {
            char start=a.charAt(startin);
            char end=a.charAt(endin);
            if(Character.toLowerCase(start)!=Character.toLowerCase(end))
            {
                count+=1;
            }
            startin++;
            endin-=1;

        }
        if(count>0){
            System.out.println("not pelendrom");

        }
        else{
            System.out.println("pelendrome");
        }

    }
    
}
