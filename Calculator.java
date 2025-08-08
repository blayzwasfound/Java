import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args) {
        double result = 0;
        boolean run = true;
        while(run)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for Square root");
            System.out.println("Enter 4 for cuberoot");
            System.out.println("Enter 5 for division");
            System.out.println("Enter 6 for multiplication");
            System.out.println("Enter 7 for power");
            System.out.println("Enter 8 for clear");
            System.out.println("Enter 9 for exiting");
            char a = sc.next().charAt(0);
            switch(a)
            {
                case '1':
                    System.out.println("Enter how many numbers you want to enter");
                    int n = sc.nextInt();
                    System.out.println("Enter the numbers");
                    for(int i = 0; i<n; i++)
                        result+=sc.nextDouble();
                    System.out.println("Result: "+result);
                break;
                case '2':
                    System.out.println("Enter how many numbers you want to enter");
                    n = sc.nextInt();
                    System.out.println("Enter the numbers");
                    for(int i = 0; i<n; i++)
                        result-=sc.nextDouble();
                    System.out.println("Result: "+result);
                break;
                case '3':
                    System.out.println("Enter 1 number");
                    result=Math.sqrt(sc.nextDouble());
                    System.out.println("Result: "+result);
                break;
                case '4':
                    System.out.println("Enter 1 number");
                    result=Math.cbrt(sc.nextDouble());
                    System.out.println("Result: "+result);
                break;
                case '5':
                    System.out.println("Enter the dividend");
                    double d = sc.nextDouble();
                    System.out.println("enter divisor");
                    double ds = sc.nextDouble();
                    result = d/ds;
                    System.out.println("Result: "+result);
                break;
                case '6':
                    System.out.println("Enter how many numbers you want to enter");
                    n = sc.nextInt();
                    System.out.println("Enter the numbers");
                    for(int i = 0; i<n; i++)
                        result*=sc.nextDouble();
                    System.out.println("Result: "+result);
                break;
                case '7':
                    System.out.println("Enter the base");
                    double b = sc.nextDouble();
                    System.out.println("Enter the power");
                    double p = sc.nextDouble();
                    result = Math.pow(b, p);
                    System.out.println("Result: "+result);
                break;
                case'8':
                    result = 0;
                    System.out.println("Result: "+result);
                break;
                case '9':
                    System.out.println("Thank you for using the calculator");
                    run = false;
                break;
            }
        }
    }
}