import java.util.Scanner;
class seconds
{
  int h,m,s;
  seconds(int x,int y,int z)
  {
   h=x;
   m=y;
   s=z;
  }
   
  seconds convert(seconds p)
  {  
    seconds q=new seconds(0,0,0);
    int t,th,tm,ts;
    th=p.s/3600;
    t=p.s%3600;
    tm=t/60;
    t=t%60;
    q.s=t;
    q.h=th+p.h;
    q.m=tm+p.m;
    return q;
  }

   void display(seconds p)
   {
     System.out.println("hours= "+p.h+" minutes= "+p.m+" seconds= "+p.s);
   }
 
  public static void main(String args[])
  {

  System.out.println("enter h m s");
  Scanner sa=new Scanner(System.in);
  int h=sa.nextInt();
  int m=sa.nextInt();
  int n=sa.nextInt();
  seconds p=new seconds(h,m,n); 
  p=p.convert(p);
  p.display(p);

 }
}       
         
            
                                        