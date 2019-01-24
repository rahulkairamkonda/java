import java.util.Scanner;    //imports scanners

public class Calc {
    
    public static void main(String[] args) {
        boolean go = true;    //sets up loop
        
        while(go)    //creates loop to top
        {
            System.out.println("Hello this is my calculator!");
            System.out.println("To add, type a, to subtract, type s.");
            System.out.println("To multiply, type m, to divide, type d.");
            
            Scanner scan = new Scanner(System.in);    //sets up scanners
            Scanner scan1 = new Scanner(System.in);
            
            
            String action = scan.nextLine();    //tells comp. to take user input
            
            if("a".equals(action))    //addition
            {
                System.out.println("Now type in the first number you would like to add.");
                int add1 = scan.nextInt();
                System.out.println("Now type the second number.");
                int add2 = scan.nextInt();
                int add3 = add1 + add2;
                System.out.println(add1 + " added to " + add2 + " equals " + add3 + "!");
            }
            if("s".equals(action))    //subtraction
            {
                System.out.println("Now type in the first number you would like to subtract.");
                int sub1 = scan.nextInt();
                System.out.println("Now type the second number.");
                int sub2 = scan.nextInt();
                int sub3 = sub1 - sub2;
                System.out.println(sub1 + " subtracted bye " + sub2 + " equals " + sub3 + "!");
            }
            if("m".equals(action))    //multiplacation
            {
                System.out.println("Now type in the first number you would like to multiply.");
                int mul1 = scan.nextInt();
                System.out.println("Now type the second number.");
                int mul2 = scan.nextInt();
                int mul3 = mul1 * mul2;
                System.out.println(mul1 + " multiplied bye " + mul2 + " equals " + mul3 + "!");
            }
            if("d".equals(action))    //division
            {
                System.out.println("Now type in the first number you would like to divide.");
                int div1 = scan.nextInt();
                System.out.println("Now type the second number.");
                int div2 = scan.nextInt();
                int div3 = div1 / div2;
                System.out.println(div1 + " divided bye " + div2 + " equals " + div3 + "!");
            }
            
            
            System.out.println("Would you like to start over? (yes,no)");
            String startOver = scan1.nextLine();
            
            if("no".equals(startOver))
            {
                go = false;
                System.out.println("Bye");
            }
        }
    }
}