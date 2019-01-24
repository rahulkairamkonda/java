class p1
{
    public static void main()
    {
        int n=150;
        int s=149;
        for(int i=1;i<=n;i++)
        {   int a=1; char c='A';
            for(int j=1;j<=s;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(a);
                a++;
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(c);
                c++;
            }
            System.out.println();
            s--;
        }
    }
}

            