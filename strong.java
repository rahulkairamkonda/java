import java.util.Scanner;
class strong
{
public static void main(String args[])
{
int n=0,m=0,r=0,f=1,s=0,q=0,p=0,c=0;
System.out.println("enter 2 nos");
Scanner a=new Scanner(System.in);
n=a.nextInt();int nos=n;
m=a.nextInt();int mos=m;
while(n>0)
{
  r=n%10;
  for(int i=0;i<r;i++)
  {
   f=f*i;
  }
  s=s+f;
  n=n/10;
}
if(nos==s)
System.out.println("it is strong");
else
System.out.println("it is not strong");
    p=(m*m);
int x=p;  
   while(p>0)
  {
    c=c+1;
    p=p/10;
  }
   q=(x%(int)Math.pow(10,(c-1)));

if(mos==q)
System.out.println("it is auto morphic");
else
System.out.println("it is auto morphic");
}
}
  
  