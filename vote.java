class vote
{
    static void display(int age)
    {
        try
        {
            if(age<18)
            {
                throw new ArithmeticException("cant vote");
            }
            else
            {
                System.out.println("can vote");
            }
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae);
        }
    }
    public static void main()
    {
        try
        {
            display(56);
        }
        finally
        {
            System.out.println("end");
        }
    }
}
