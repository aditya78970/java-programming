import java.util.ArrayDeque;

public class arrayqueue {
    public static void main(String asq[]) {
        ArrayDeque<String> list=new ArrayDeque<>();
        list.add("hello");
        list.add("my");
        list.add("name");
        list.add("ho lllooo");

        System.out.println("elements in the queue"+list);
        System.out.println("remove element  "+list.remove());
        System.out.println("head"+list.element());

        
    }
    
}
