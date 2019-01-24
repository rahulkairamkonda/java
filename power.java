import java.util.Scanner;
class power
{
 public static void main(String args[])
 {
  int x=0,n=0,p=1;
  System.out.println("enter x and n");
  Scanner s=new Scanner(System.in);
  x=s.nextInt();
  n=s.nextInt();
  for(int i=1;i<=n;i++)
  {
   p=p*x;
  }
  
  System.out.println("power ="+p);
  }
}
  