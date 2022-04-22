import java.util.LinkedList;
import java.util.List;

public class ListToArray {
    public static void main(String asq[]) {
        
    
        List<String> list = new LinkedList<String>();
 
        // Adding custom element to LinkedList
        // using add() method
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("Practice");
 
        // Storing it inside array of strings
        String[] arr = new String[list.size()];
 
        // Converting ArrayList to Array
        // using get() method
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
 
        // Printing elements of array on console
        for (int j=0;j<arr.length;j++)
            System.out.print( arr[j]+ " ");
    
}
}
