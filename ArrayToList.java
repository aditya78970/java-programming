public class ArrayToList {
    public static void main(String asq[])
    {
        Integer[] arr={81,82,83,84,85};
 
        //print content of Array
        System.out.println("Elements of Array are:");
        for (int a: arr)
        {
            System.out.println(a);
        }
 
        //Convert array into list using  Arrays.asList() method 
        List<Integer> list=Arrays.asList(arr);
        System.out.println("Elements of list are:");
        //print elements of list
        System.out.println(list);
    
    }
    
}
