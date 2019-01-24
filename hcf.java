import java.util.Scanner;
class hcf
{
 int hcfs(int x,int y)
 { 
   int i,g,h=1;
   if(x<y)
   g=x;
   else
   g=y;
 
   for(i=2;i<=g;i++)
   {
    if(x%i==0&&y%i==0)
        h=i;
    
   }
   return h;
 }

  int lcm(int a,int b)
  {
    int l=1,g;
    if(a>b)
    g=a;
    else 
    g=b;
    for(int i=2;i<=g;i++)
    { 
      if(a%i!=0&&b%i!=0)
      { 
       l=i; 
      }
      else
      l=(a*b);
     }  
  
   return l;           
  }

  public static void main(String args[])
  {
   System.out.println("enter 2 nos");
   Scanner a=new Scanner(System.in);
   int n=a.nextInt();
   int m=a.nextInt();
   hcf p=new hcf();
   int j=p.hcfs(n,m);
   int l=p.lcm(n,m);
   System.out.println("hcf="+j);
   System.out.println("lcm="+l);
  }
}
   
