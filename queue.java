import java.util.PriorityQueue;

public class queue {
    public static void main(String asq[])
     {
        PriorityQueue<Integer> number=new PriorityQueue<>();
        number.add(1);
        number.add(12);
        number.add(311);
        number.add(221);
        number.add(154);

        while(!number.isEmpty())
        {
            System.out.println("removed element: "+number.poll());
        }
        System.out.println("removed element: "+number);
        
    }
    
}
