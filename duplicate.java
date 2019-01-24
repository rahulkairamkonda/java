import java.util.Scanner;
class duplicate
{
    public static void main()
    {
        int c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("enter");
            a[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n;)
            {
                if (a[j] == a[i])
                {
                    outer : for (int k = j; k < n; k++)
                    {
                        if((k+1)>n-1)
                        break outer;
                        else
                        a[k] = a[k + 1];
                    }
                    n--;
                }
                else
                {
                 j++  ; 
                }
            }
        }

        
        for(int i=0;i<n;i++)
        {
            System.out.print(+a[i]+"\t");
        }
    }
}

        
        