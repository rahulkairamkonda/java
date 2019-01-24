/*abstract class exam
{
    public abstract void display();
    void show()
    {
        System.out.println("abs class");
    }
}*/
class internal extends exam
{
    int m=90;
    public void display()
    {
        System.out.println("internals = "+m);
    }
}
class external extends exam
{
    int e=30;
    public void display()
    {
        System.out.println("external= "+e);
    }
}
public class abs_imp
{
    public static void main()
    {
        internal I=new internal();
        external E=new external();
        I.display();
        E.display();
        //I.show();
        //E.show();
    }
}

        