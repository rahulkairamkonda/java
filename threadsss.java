class thread1 extends Thread
{
    public void run()
    {
        System.out.print("/");
    }
}
class thread2 extends Thread
{
    public void run()
    {
        System.out.print(" * ");
    }
}
public class threadsss
{
    public static void main()
    {
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.start();
        t1.stop();
        t2.start();
    }
}
