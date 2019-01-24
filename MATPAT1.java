import java.util.Scanner;
class MATPAT1
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
        
                                                                 //   System.out.println(a.length);//gives nos of rows appropriately
        
         for(int i=0;i<a.length;i++)
        { 
            k=1;
            for(int j=0;j<a[i].length;j++)
            {
              a[i][j]=k;
              k++; 
                                                    //  System.out.println(a[i].length);//condition for a[i] works fine and space is saved 
            }
            System.out.println();
        }
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {   
                System.out.print(a[i][j]);                          
            }
            System.out.println();
        }
    }
} 
