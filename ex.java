import java.util.*;
class Myexception extends Exception
{
    Myexception(String s)
    {
        super(s);
    }
}
public class ex
{
    public static void main()
    {
        String q="rahul";
        Scanner sc=new Scanner(System.in);
        System.out.println("enter user name");
        String s=sc.next();
        try
        {
            if(q.equals(s))
            {
                System.out.println("hey");
            }
            else
            {
                throw new Myexception("wrong hai!!!!\nre enter");
            }
        }
        catch(Myexception a)
        {
            System.out.println(a.getMessage());
        }
    }
}

