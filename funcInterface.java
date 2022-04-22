/**
 * InnerfuncInterface
 */
interface myInterface 
{
    int value();
    
}
// we cannnot go if multiple method only 1 method



public class funcInterface 
{
    public static void main(String asu[]) {
        myinterface ref;
        ref=()->{return(100);};
        System.out.println(ref.value());
        
    }
    
}
