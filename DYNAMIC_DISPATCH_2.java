class base
{
    void display()
    {
        System.out.println("class base");
    }
}
class dere extends base
{
    void display()
    {
        System.out.println("class dereived");
    }
}
public class DYNAMIC_DISPATCH_2
{
    public static void main()
    {
        base b=new base();
        dere d=new dere();
        base B;
        B=b;
        B.display();
        B=d;
        B.display();
    }
}