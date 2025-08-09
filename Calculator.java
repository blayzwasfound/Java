import java.util.Scanner;//importing scanner
public class Calculator//declaring public class
{//class block open
    public static void main(String[] args) {//main block open
        double result = 0;//initialising result value
        boolean run = true;//for while true
        while(run)
        {
            Scanner sc = new Scanner(System.in);//creating scanner object
            System.out.println("Enter 1 for addition");//printing statment
            System.out.println("Enter 2 for subtraction");//printing statment
            System.out.println("Enter 3 for Square root");//printing statment
            System.out.println("Enter 4 for cuberoot");//printing statment
            System.out.println("Enter 5 for division");//printing statment
            System.out.println("Enter 6 for multiplication");//printing statment
            System.out.println("Enter 7 for power");//printing statment
            System.out.println("Enter 8 for clear");//printing statment
            System.out.println("Enter 9 for exiting");//printing statment
            char a = sc.next().charAt(0);//accepting choice
            switch(a)//switch statement
            {
                case '1':
                    System.out.println("Enter how many numbers you want to enter");//printing statement
                    int n = sc.nextInt();//accepting the length
                    System.out.println("Enter the numbers");//printing statement
                    for(int i = 0; i<n; i++)
                        result+=sc.nextDouble();//calculating sum
                    System.out.println("Result: "+result);
                break;
                case '2':
                    System.out.println("Enter how many numbers you want to enter");//printing statement
                    n = sc.nextInt();//accepting the length
                    System.out.println("Enter the numbers");//printing statement
                    for(int i = 0; i<n; i++)
                        result-=sc.nextDouble();//calculating difference
                    System.out.println("Result: "+result);//printing statement
                break;
                case '3':
                    System.out.println("Do you want to use the result or own number? Y for Yes and N for No");
                    char c = sc.next().charAt(0);
                    if(c=='y'||c=='Y')
                    {
                        result = Math.sqrt(result);//calculating the square root
                        System.out.println("Result: "+result);//printing statement
                    }
                    else if(c=='n'||c=='N')
                    {
                        System.out.println("Enter 1 number");//printing statement
                        result=Math.sqrt(sc.nextDouble());//calculating the square root
                        System.out.println("Result: "+result);//printing statement
                    }
                    else
                        System.out.println("Wrong Option!");
                break;
                case '4':
                    System.out.println("Do you want to use the result or own number? Y for Yes and N for No");
                    c = sc.next().charAt(0);
                    if(c=='y'||c=='Y')
                    {
                        result = Math.cbrt(result);//calculating the cube root
                        System.out.println("Result: "+result);//printing statment
                    }
                    else if(c=='n'||c=='N')
                    {
                        System.out.println("Enter 1 number");//printing statement
                        result=Math.cbrt(sc.nextDouble());//calculating the cube root
                        System.out.println("Result: "+result);//printing statement
                    }
                    else
                        System.out.println("Wrong option!");
                break;
                case '5':
                    System.out.println("Do you want to use the result or own number? Y for Yes and N for No");
                    c = sc.next().charAt(0);
                    if(c=='y'||c=='Y')
                    {
                        System.out.println("enter divisor");//printing statement
                        double d = sc.nextDouble();//accepting the divisor
                        result=result/d;//finding the result
                        if(d==0)
                            System.out.println("Undefined");//printing statement
                        else
                            System.out.println("Result: "+result);//printing statement
                    }
                    else if(c=='n'||c=='N')
                    {
                        System.out.println("Enter the dividend");//printing statement
                        double d = sc.nextDouble();//accepting the dividend
                        System.out.println("enter divisor");//printing statement
                        double ds = sc.nextDouble();//accepting the divisor
                        result = d/ds;//calculating the division
                        if(d==0)
                            System.out.println("Undefined");//printing statement
                        else
                            System.out.println("Result: "+result);//printing statement
                    }
                    else
                        System.out.println("Wrong option!");
                break;
                case '6':
                    System.out.println("Enter how many numbers you want to enter");//printing statement
                    n = sc.nextInt();//accepting the length
                    System.out.println("Enter the numbers");//printing statement
                    for(int i = 0; i<n; i++)
                        result*=sc.nextDouble();//calculating the product
                    System.out.println("Result: "+result);//printing statement
                break;
                case '7':
                    System.out.println("Do you want to use the result or own number? Y for Yes and N for No");
                    c = sc.next().charAt(0);
                    if(c=='y'||c=='Y')
                    {
                        System.out.println("Enter the power");//printing statement
                        double p = sc.nextDouble();//accepting the power
                        result = Math.pow(result,p);//calculating the value
                        System.out.println("Result: "+result);//printing statement
                    }
                    else if(c=='n'||c=='N')
                    {
                        System.out.println("Enter the base");//printing statement
                        double b = sc.nextDouble();//accepting the base
                        System.out.println("Enter the power");//printing statement
                        double p = sc.nextDouble();//accepting the power
                        result = Math.pow(b, p);//calculating the value
                        System.out.println("Result: "+result);//printing statement
                    }
                    else
                        System.out.println("Wrong option!");
                    
                break;
                case'8':
                    result = 0;//setting the result to 0
                    System.out.println("Result: "+result);//printing statement
                break;
                case '9':
                    System.out.println("Thank you for using the calculator");//printing statement
                    run = false;//setting bool to false
                break;
            }
        }
    }
}
