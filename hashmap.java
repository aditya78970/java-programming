import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class hashmap 
{

    public static void main(String asq[]) throws IOException
    {
        Map<Integer,String> no=new HashMap<>();// Creating a map using the HashMap
        no.put(1,"one");// Insert elements to the map
        no.put(2,"two");
        System.out.println("Map: " + no);
        System.out.println("Keys: " + no.keySet());// Access keys of the map
        System.out.println("Values: " + no.values());// Access values of the map
        System.out.println("Entries: " + no.entrySet());// Access entries of the map
        String value = no.remove("Two");
        System.out.println("Removed Value: " + value);// Remove Elements from the map
        
    
    

        
         class a
        {
            int k;
            String n;
            a(int k,String n)
            {
                this.k=k;
                this.n=n;
            }
            public String toString()
            {
                return("key is"+k+"record is"+n);
            }
            a a1=new a(10,"channai");
        a a2=new a(10,"channai");
        a a3=new a(10,"channai");
        Map<Integer,a> obj=new HashMap<>();
        obj.put(a1.k,a1);
        obj.put(a1.k,a2);
        obj.put(a1.k,a3);
        System.out.println("Removed Value: " + obj);
        }
    }
}
