class p3
{
    public static void main()
    {
        int i,j,s;
        s=8;
        char c;

        for(i=1;i<=9;i++)
        {
            c='A';

            for(j=1;j<=s;j++)
            {
                System.out.print(" ");
            }

            for(j=1;j<=i;j++)
            {
                System.out.print(c);
                c++;
            }
            c--;
            c--;
            for(j=2;j<=i;j++)
            { 
                System.out.print(c);
                c--;
            }
            System.out.println(); 
            s--;
        }
    }
}

        