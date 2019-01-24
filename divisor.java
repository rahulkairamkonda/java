class divisor
{
public static void main(String args[])
{
int v,l=0,g=0,i;

for(i=1;i<=1000;i++)
{  
   v=0;
  for(int j=1;j<=i;j++)
   {
    if(i%j == 0)
     v=v+1;
   }
    if(v>l)
     {
      l=v;g=i;
     }
             
     
}
System.out.println("greatest common divisor is "+l);
System.out.println("nos is ="+g);

for(int x=1;x<=g;x++)
{
if(g%x==0)
{
System.out.println("divisors are="+x);
}
}
}
}
