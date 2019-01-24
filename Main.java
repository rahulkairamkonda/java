import java.io.*;
class Movie extends Thread
{
    int vacant=1,required;
    Movie(int x)
    {
        required=x;
    }

    public synchronized void run()
    {
        {
            if(vacant>=required)
            {
                System.out.println(required+" tickets booked for "+Thread.currentThread().getName());
                try
                {
                    Thread.sleep(100);
                }
                catch(Exception e)
                {
                }
                vacant-=required;
            }
            else
            {
                System.out.println("House Full "+Thread.currentThread().getName());
            }
        }
    }
}
public class Main
{
    public static void main(String args[])
    {
        Movie n=new Movie(1);
        Thread t1=new Thread(n);
        Thread t2=new Thread(n);
        t1.setName("Ajay");
        t2.setName("Vijay");
        t1.start();
        t2.start();
    }
}