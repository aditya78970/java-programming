class Count1 extends Thread
{
    Count1()
    {
        super("my extended thread");
        System.out.println("my thread created"+this);
        start();
    }
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("print count "+ i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
public class multithreading {
    public static void main(String[] args) {
        Count1 cnt=new Count1();
        
        try
        {
            while(cnt.isAlive())
            {
                System.out.println("main thread will be alive until child thread live");
                Thread.sleep(1000);
            }

        }
        catch(InterruptedException e)
        {
            System.out.println("my thread interrupted");
        }
        System.out.println("main thread run is over");
    }

    
}
