import java.util.Scanner;
class AUTOMORPHOC 
{
    public static void main()
    {
        int n,m,r,f,s,q,p;
        n=m=r=s=q=p=0;
        f=1;int c=0;
        System.out.println("enter nos");
        Scanner a=new Scanner(System.in);
        //n=a.nextInt(); int nos=n;
        m=a.nextInt(); int mos=m;
        do
        {

            c++;
            m=m/10;
        }while(m>0);
        p=mos*mos;
        q=(p%(int)Math.pow(10,c));
        if(q==mos)
        { 
            System.out.println("yous");

        }
        else
        {
            System.out.println("nopesp");
        }

    }
}
