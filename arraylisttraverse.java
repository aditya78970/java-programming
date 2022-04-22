import java.util.*;
public class arraylisttraverse {
    public static void main(String asq[]) {
        
    
    ArrayList<String> lang=new ArrayList<>();
    lang.add("java");
    lang.add("javascript");
    lang.add("python");
    lang.add("javascript");
    System.out.println("Arreylist" +lang);

    for(int i=0;i<lang.size();i++)
    {
        System.out.println(lang.get(i));
    }
    
}
}