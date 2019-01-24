interface shape
{
    int PI=3;
    void display();
}
class cyl implements shape
{
    public void display()
    {
      int a=3*PI;
      System.out.println(a);
    }
}
public class test123
{
    public static void main()
    {
        cyl e=new cyl();
        //shape s;
        //s=e;
        e.display();
    }
}

        