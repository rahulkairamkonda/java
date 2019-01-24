import java.util.Scanner;
class series
{
 public static void main(String args[])
 {
   int n=0,p=0,sum=0,f=1;
   System.out.println("enter n");
   Scanner s=new Scanner(System.in);
   n=s.nextInt();
   for(int i=1;i<=n;i++)
   {
     for(int j=1;j<=i;j++)
     {
       f=f*i;
     }
     
     p=(int)Math.pow(i,i);
     sum=sum+(p/f) ;
   }
  
  System.out.println("series sum="+sum);
}
}
 