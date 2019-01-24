import java.util.Scanner;
class lucky
{
   int sum(int a)
  {
   int n=0,s=0;
   while(a>0)
   { 
    n=a%10;
    s=s+n;
   }
    return s;
  }
  
 int sumfinal(int a)
  {
   int n=0,s=0,c=0,n1=0;
   while(a>0)
   {
    n1=a%10;
    c=c+1;
   }
   if(c>=2)
   {
    while(a>0)
    {
      n=a%10;
      s=s+n;   
    }
   }
    else
    s=a;
   return s;
   }

  public static void main(String args[])
  {
   System.out.println("enter dd/mm/yyyy");
   Scanner a=new Scanner(System.in);
   int l=a.nextInt();
   int m=a.nextInt();
   int n=a.nextInt();
   lucky r=new lucky();
   int q1=r.sum(l);
   int q2=r.sum(m);
   int q3=r.sum(n);
   int s1=q1+q2+q3;
   int f1=r.sumfinal(s1);
   System.out.println("lucky nos="+f1);
  }
}