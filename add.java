class add
{
    int x,y;
    int sum;
    add(int p,int q)
    {
        x=p;
        y=q;
    }

    add sum(add a)
    {

        a.sum=a.x+a.y;
        return a;
    }

    void display(add a)
    {
        System.out.println("sum is "+a.sum);
    }

    public static void main(String args[])
    {
        add a=new add(10,20);
        a=a.sum(a);
        a.display(a);
    }
}

        