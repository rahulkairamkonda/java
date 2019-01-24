class p2
{
    public static void main()
    {  int lgh=0;
        for (int i=1;i<=lgh;i++){
            for (int a=1;a<=lgh;a++){
                if(i>1 && i<lgh && a>1 && a<lgh)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
}
