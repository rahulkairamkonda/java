import java.util.*;
class multirahul
{
    void read(int a[][])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 9 values");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    void display(int a[][])
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void mul(int a[][],int b[][],int c[][])
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
    }
    public static void main()
    {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        multirahul r=new multirahul();
        r.read(a);
        r.display(a);
        r.read(b);
        r.display(b);
        r.mul(a,b,c);
        r.display(c);
    }
}

 
        