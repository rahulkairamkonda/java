import java.util.*;
class lucky
{
    static int sum(int x)
    {
        int sum=0;
        while(x>0)
        {
            int r=x%10;
            sum=sum+r;
            x=x/10;
        }
        return sum;
    }

    public static void main()
    {
        Scanner s=new Scanner(System.in);int e=0;
        System.out.println("enter date month year in DDMMYYYY");
        int d=s.nextInt();
        int m=s.nextInt();
        int y=s.nextInt();
        int p=sum(d);
        int q=sum(m);
        int r=sum(y);
        int t=p+q+r;
        while(t>10)
        {
            t=sum(t);
        }
        System.out.println("lucky"+t);
    }
}