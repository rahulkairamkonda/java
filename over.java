 import java.util.Scanner;
class over
{
  int vol(int r)
  {
     int v;
     v=r*r*r;
     return v;
  }
  
  float vol(float r)
  {
    float v;
    v=(float)((4*r*r*r*3.14f)/3);
    return v;
  }
  
  double vol(int r,int h)
  {
    double v;
    v=(double)(3.14f*r*r*h);
    return v;
  }
   
  public static void main(String args[])
  {
    int vol1;
    float vol2;
    double vol3;
    
    Scanner s=new Scanner(System.in);
    over q=new over();
    
    System.out.println("enter side of cube");
    int a=s.nextInt();
    vol1=q.vol(a);
    System.out.println("volume of the cube = "+vol1);
    
    System.out.println("enter radius of the sphere");
    float r=s.nextFloat();
    vol2=q.vol(r);
    System.out.println("volume of the sphere = "+vol2);

    System.out.println("enter radius and height of cyl");
    int x=s.nextInt();
    int y=s.nextInt();
    vol3=q.vol(x,y);
    System.out.println("volume of the cylinder = "+vol3);
    
   }
}


