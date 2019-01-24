import java.util.Scanner;
class SECONDS
{
    int h,m,s;
    SECONDS(int x,int y,int z)
    {
        h=x;
        m=y;
        s=z;
    }
    SECONDS convert(SECONDS q)
    {
        int t,th,tm,ts,mins=0,abc,pqr,hours1=0;
        SECONDS R=new SECONDS(0,0,0);
        
        th=q.m/60; //th has hours ka value(HOURS PART 1)
        tm=q.m%60; //t is temp holding mins ka final value (MINS PART 1)
       
        mins=q.s/60;//temporaray mins which is now put into condition
        ts=q.s%60;//final seconds no chnages (SEC FINAL)
        
        if(mins>60)
        {
            abc=mins/60;//  abc has hours (HOURS PART 2) 
            pqr=mins%60;//  pqr has mins  (MINS PART 2)
        }
        else
        {
            abc=0;
            pqr=mins;
        }
        
        int finalmins=tm+pqr;
        
        if(finalmins>60)
        {
            hours1=finalmins/60;
            finalmins=finalmins%60;
        }
        
        R.s=ts;
        R.h=q.h+th+abc+hours1;
        R.m=finalmins;
        return R;
    }
    void display(SECONDS p)
    {
        int h1=p.h;
        int m1=p.m;
        int s1=p.s;
        System.out.println("hours = "+h1+"minutes = "+m1+"seconds = "+s1);
    }
    public static void main()
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter hrs mins secs");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        SECONDS g=new SECONDS(a,b,c);
        g=g.convert(g);
        g.display(g);
    }
}

        
       
        
        
        
        