import java.util.*;
class first_caps
{
    public static void main()
    {
        char c[]=new char[100];
        char x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== ' ')
            {
             x=s.charAt(i+1);
             s.replace(s.charAt(i+1),'A');
            }
        }
        for(int i=0;i<c.length;i++)
        System.out.print(c[i]);
    }
}
//program wrong hai!!!!!
//easy hai but 