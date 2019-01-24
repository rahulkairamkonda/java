import java.util.*;
abstract class shape
{
    double PI=3.14;
    abstract void display(double r);
}
class cylinder extends shape
{
    double a,r;
    public void display(double r1)
    {
        r=r1;
        a=2*PI*r*(10+r);
        System.out.println(a);
        //System.out.println(Math.sqrt(a));reference
    }
}
class cone extends shape 
{
    double a,r;
    public void display(double r1)
    {
        r=r1;
        a=PI*r*(r+Math.sqrt((100+(r*r))));
        System.out.println(a);
    }
}
public class shapes
{
    public static void main()
    {
        shape s;
        s=new cylinder();
        s.display(2.9);
        s=new cone();
        s.display(3.7);
    }
}

        
        
        
        
        
        
        
        