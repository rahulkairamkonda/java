class diamond_pattern
{
    public static void main()
    {
        int a,i,j;
        int n=5;
        int s=4;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=s;j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(j=2;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();s--;
        }
        s=0;
        for(i=n-1;i>=1;i--)
        {   System.out.print(" ");
            for(j=1;j<=(s);j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(j=2;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            s++;
        }
    }
}

            
