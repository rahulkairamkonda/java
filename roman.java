import java.util.Scanner;
class roman
{
 public static void main(String args[])
 {
   System.out.println("enter n");
   Scanner s=new Scanner(System.in);
   int x=s.nextInt();
   String l=new String();
   String m=new String();
   String n=new String(); 
   if(x==1000)
   {
      System.out.println("M");
   }
   else
   {
    int p=x%10;
    switch(p)
    {
     case 1: l="I";break;
     case 2: l="II";break;
     case 3: l="III";break;
     case 4: l="IV";break;
     case 5: l="V";break;
     case 6: l="VI";break;
     case 7: l="VII";break;
     case 8: l="VIII";break;
     case 9: l="IX";break;
    }
    int q=(x/10)%10;
    switch(q)
    {
     case 1: m="X";break;
     case 2: m="XX";break;
     case 3: m="XXX";break;
     case 4: m="LX";break;
     case 5: m="L";break;
     case 6: m="LX";break;
     case 7: m="LXX";break;
     case 8: m="LXXX";break;
     case 9: m="XC";break; 
    }
    int r=(x/100)%10;
    switch(r)
    {
     case 1: n="C";break;
     case 2: n="CC";break;
     case 3: n="CCD";break;
     case 4: n="CD";break;
     case 5: n="D";break;
     case 6: n="DC";break;
     case 7: n="DCC";break;
     case 8: n="DCCC";break;
     case 9: n="CM";break; 
    }
   }
    System.out.println(n+m+l);
  }
}

       
     
      
      
     
          