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
        super.display();
        System.out.print("\nhey in dervied");
    }
}
public class superkeywordkaprg
{
    public static void main()
    {
        derive d=new derive();
        d.display();
    }
}
