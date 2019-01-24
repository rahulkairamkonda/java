class p4
{
    public static void main(String args[])
    {
        int a,i,j,s;
        s=3;
        char c;

        for(i=1;i<=4;i++)
        {
            c='A'; a=i;

            for(j=1;j<=s;j++)
            {
                System.out.print(" ");
            }

            for(j=1;j<=i;j++)
            {
                System.out.print(a);
                a--;
            }
      
            for(j=2;j<=i;j++)
            { 
                System.out.print(c);
                c++;
            }
            System.out.println(); 
            s--;
        }
    }
}

        