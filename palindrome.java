import java.util.Scanner;
class palin
{
public static void main(String args[])
{
int n,r=0,p=0;
System.out.println("enter nos");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int nos=n;
 while(n>0)
 {
  r=n%10;
  p=(p*10)+r;
  n=n/10;
 }
 if(nos==p)
System.out.println("it is plaindrome");
else
System.out.println("it is not plaindrome");
}
}
  