import java.util.Scanner;
class matpat
{

 public static void main(String args[])
 { 
   int k;
   System.out.println("enter n for rows");
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int a[][]=new int[n][];
    for(int i=0;i<n;i++)
     {
      a[i]=new int[i+1];
     }
    
    for(int i=0;i<a.length;i++)
     {
       for(int j=0;j<a[i].length;j++)
        {
          if(j==0)
            System.out.print("*");
          else if(i==j)
             System.out.print("*");
          else if(i==n-1)
             System.out.print("*");
          else
             System.out.print(" ");
         }
        System.out.println();
      }
    }
  }

   