import java.util.*;
public class SwitchYear {
    public static void main(String qwa[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no from 1 -12");
        i=sc.nextInt();
        switch(i)
        {
            case 1:
                System.out.println("january has 31 days");
                break;
            case 2:
    //statement of case 2
                System.out.println("feb :28");
                break;
            case 3:
    //statement of case 3
                System.out.println("march:31");
                break;
            case 4:
                System.out.println("april: 30");
                break;
            case 5:
    //statement of case 2
                System.out.println("may :31");
                break;
            case 6:
    //statement of case 3
                System.out.println("june: 30");
                break;
            case 7:
                System.out.print("july: 31");
                break;
            case 8:
                System.out.println("Aug: 31");
                break;
            case 9:
    //statement of case 2
                System.out.println("Sep31");
                break;
            case 10:
    //statement of case 3
                System.out.println("31");
                break;
            case 11:
                System.out.println("nov: 30");
                break;
            case 12:
                System.out.println("dec : 31 days");
                break;    
            default:
                System.out.println("enter no is not in 1-12");
        }
    }
    
}
