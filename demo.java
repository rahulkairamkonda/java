public class demo
{
    public static void main()
    {
        final customer c=new customer();
        Thread t1=new Thread()
        {
            public void run()
            {
                c.withdraw(5000);
                System.out.println(c.amt);
            }
        }
        Thread t2=new Thread()
        {
            public void run()
            {
                c.deposit(10000);
                System.out.println(c.amt);
            }
            t1.setName("rahul");
            t2.setName("ansh");
        }
        t1.start();
        t2.start();
    }
}
public class customer
{
    int amt=0,flag=0;
    public synchronized int withdraw(int a)
    {
        System.out.println(Thread.currentThread().getName()+"is waiting to withdraw");
        if(flag==0)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        amt=amt-a;
        System.out.println("withdraw completed");
        return(amt);
    }
}
public class customer
{
    int amt=0,flag=0;
    public synchronized int deposit(int a)
    {
        System.out.println(Thread.currentThread().getName()+"has deposited the amount");
        amt=amt+a;
        notifyAll();
        flag=1;
    }
}


        