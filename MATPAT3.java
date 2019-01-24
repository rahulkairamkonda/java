import java.util.Scanner;
class MATPAT3
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n rows");
        int n=sc.nextInt();int k;
        int a[][]=new int[n][];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<n;j++)
            {   
                if(j==0)
                    System.out.print("*");
                else if(j==n-1)
                     System.out.print("*"); 
                else if(i==0)
                    System.out.print(" * ");
                else if(i==n-1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");//space is given more so that the code looks good
            
            }
            System.out.println();
        }
    }
}
