class base
{
    void display()
    {
        System.out.println("base class");
    }
}

class dereived extends base
{
    void show()
    {
        System.out.println("dereived class");
    }
}
public class INHERITANCE_1
{
    public static void main(String args[])
    {
        dereived D=new dereived();
        {
            D.display();
            D.show();
        }
    }
}
