import java.util.Scanner;
class MATPAT2
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n rows");
        int n=sc.nextInt();int k;
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
