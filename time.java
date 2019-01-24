import java.util.Scanner;
class time
{
public static void main(String args[])
{
int h,m,s=0;
System.out.println("enter hours then mins");
Scanner a= new Scanner(System.in);
h=a.nextInt();
m=a.nextInt();
s=((h*60*60)+(m*60));
System.out.println("time in secondsis = "+s);
}
}