abstract class exam 
{
    public abstract void display();
    void show()
    {
        System.out.print("abs class");
    }
}
class internal extends exam
{
    int m=90;
    public void display()
    {
        System.out.println("internal="+m);
    }
}
class external extends exam
{
    int m=25;
    public void display()
    {
        System.out.println("external="+m);
    }
}
public class mainprg
{
    public static void main()
    {
        internal m=new internal();
        external l=new external();
        
        m.display();
        l.display();
        m.show();
        l.show();
    }
}
