class Super
{
    int i=10;
}
class base1 extends Super
{
    int m=super.i;
    public void show()
    {
      System.out.println("value using super.i is = "+m);
    }
}
public class super_keyword
{
    public static void main(String args[])
    {
        base1 d=new base1();
        d.show();
    }
}

        