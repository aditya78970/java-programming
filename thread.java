public class thread  implements Runnable
{
    public static void main(String[] args) 
    {
        Thread obj1= new Thread();
        Thread obj2=new Thread();
        Thread thread1= new Thread(obj1);
        Thread thread2=new Thread(obj2);
        thread1.start();
        thread2.start();
        System.out.println(thread1);
        System.out.println(thread2.getName());


    }
    public void run() 
    {
        System.out.println("executing the thread"); 
    }
        
    
    
}
