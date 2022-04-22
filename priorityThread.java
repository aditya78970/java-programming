public class priorityThread extends Runnable
{
    public void run() 
    {
        System.out.println("executing the thread"); 
    }
      
    public static void main(String[] args) 
    {
        Thread obj1= new Thread();
        
        Thread thread1= new Thread(obj1,"first");
        Thread thread2=new Thread(obj1,"second");
        Thread thread3=new Thread(obj1,"third");

        thread1.setPriority(6);
        thread2.setPriority(2);
        thread3.setPriority(1);

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println(thread1);
        System.out.println(thread2);
        System.out.println(thread3);


    }
    
}
