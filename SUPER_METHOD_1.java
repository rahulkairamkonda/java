import java.util.*;
class student 
{
    String sname;
    int roll;
    void getdata()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name and roll number:-");
        try
        {
          sname=sc.next();
          roll=sc.nextInt();
        }
        catch(Exception asfdwf)
        {
            System.out.println(asfdwf);
        }
    }
}
class college extends student
{
    String cname;
    int code;
    void getdata()
    {
        super.getdata();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter college name and code:-");
        cname=sc.next();
        code=sc.nextInt();
    }
    void display()
    {
        System.out.println("sname = "+sname);
        System.out.println("rollno = "+roll);
        System.out.println("cname = "+cname);
        System.out.println("code = "+code);
    }
}
public class SUPER_METHOD_1
{
    public static void main(String arg[])
    {
        college c[]=new college[3];
        
        for(int i=0;i<3;i++)
        {
            c[i]=new college();
            c[i].getdata();
            c[i].display();
        }
    }
}

        
        
        