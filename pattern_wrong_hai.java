class pattern_wrong_hai
{
    public static void main()
    {
        int i,j,k=0,l;
        for(i=1;i<=4;i++)
        {
            for(j=1;j<=i;j++)
            {
                k++;
                System.out.print(k%2+" ");k=k+2;
            }
            System.out.println();
        }
    }
}
