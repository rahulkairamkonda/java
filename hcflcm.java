import java.util.Scanner;
class hcflcm
{
    void hcf(int a,int b)
    {   
        int g,h=0;
        if(a>b)
         g=a;
        else
         g=b;
        for(int i=1;i<=g;i++)
        {
            if(a%i==0 && b%i==0)
            {
                h=i;
            }
        }
        System.out.println("HCF IS"+h);
    }

    void lcm(int a,int b)
    {   int g,l=0,min;
        if(a>b)
        {
         g=a;
         min=b;
        }
        else
        {
          g=b;
          min=a;
        }
        for(int i=1;i<=g;i++)
        {   int m=g*i;
            if(m%min == 0)
            {
                l=m;break;
            }
        }
        System.out.println("LCM IS"+l);
    }

    public static void main()
    {
        int x,y;
        Scanner s=new Scanner(System.in);
        System.out.println("enter two numbers");
        x=s.nextInt();
        y=s.nextInt();
        hcflcm a=new hcflcm();
        a.hcf(x,y);
        a.lcm(x,y);
    }
}