import java.util.Scanner;
class multiply
{
 
   int a[][],b[][],c[][];
   int r,col;
   
   multiply(int x,int y)
   {
     r=x; col=y;
     a=new int[r][col];
     b=new int[r][col];
     c=new int[r][col];
   }
   
   void read(int a[][]) 
   {
      Scanner s=new Scanner(System.in);
      System.out.println("enter values in the array");
      for(int i=0;i<a.length;i++)
      {
        for(int j=0;j<a[i].length;j++)
        {
          a[i][j]=s.nextInt();
        }
      }
    }
    
    void mul(int a[][],int b[][])
    {
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<col;j++)
         {
           for(int k=0;k<r;k++)
            {
              c[i][j]=c[i][j]+a[i][k]*b[k][j];
            }
          }
        }
      }
      
     void display(int a[][])
     {
       for(int i=0;i<r;i++)
        {
         for(int j=0;j<col;j++)
          { 
            System.out.print(a[i][j]+" ");
          }
         System.out.println();
         }
      }
    
  public static void main(String args[])
   { 
       Scanner sc=new Scanner(System.in);
       System.out.println("enter rows and colums");
       int p=sc.nextInt();
       int q=sc.nextInt();
       multiply rahul=new multiply(p,q);  
       rahul.read(a);
       rahul.read(b);
       rahul.mul(a,b);
       rahul.display(c);
    } 
 }  
     
     
