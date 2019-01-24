class base 
{
    void display()
    {
        System.out.print("\nhey in base");
    }
}
class derive extends base
{
    void display()
    {
        System.out.print("\nhey in dervied");
    }
}
public class dynadisp
{
    public static void main()
    {
        derive d=new derive();
        base b=new base();
        base B;
        B=d;
        B.display();
        B=b;
        B.display();
    }
}
