/*Write a program with an interface account with default methods & static variables*/
interface account{
    // Static method
	 static void Savings() {
         int a;
         int b;
        System.out.println("Savings");
    }
    static void Current() {
        System.out.println("Printing Current account");
    }
    // Default Method
    default void account1() {
        System.out.println("account");
    }
    // Abstract Method
    //void getInfo();
}
public class Interfacemethod implements account {
    public static void main(String asq[]) {
        account a1=new Interfacemethod();
        account.Savings();
        account.Current();
        a1.account1();
        
            
        
        
    }
    
}
