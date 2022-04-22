import java.util.HashMap;

public class hashmapelement {
    public static void main(String asq[])
    {
        HashMap<Integer,String> hash=new HashMap<Integer,String>();
        hash.put(10,"html");
        hash.put(4,"css");
        hash.put(5,"bootstrap");
        hash.put(130,"javascript");
        System.out.println("Initial Mappings are: " + hash);
        System.out.println("Is the key '20' present " +
        hash.containsKey(20));

    }
    
}
