import java.util.Scanner;

public class DuckPrime
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = sc.next();
        int check = 0, zero = 0;
        for(int i = 0; i<num.length(); i++)
        {
            if(Character.isDigit(num.charAt(i)))
            {
                check++;
                if(num.charAt(i)=='0')
                    zero++;
            }
        }
        if(check==num.length())
        {
            int st = Integer.valueOf(num);
            if(zero>0)
            {
                int pcheck = 0;
                for(int i =1; i<=st; i++)
                {
                    if(st%i==0)
                        pcheck++;
                }
                if(pcheck==2)
                    System.out.println("The entered number is Duck Prime number");
                else
                    System.out.println("The entered number is not Duck Prime");
            }
            else
            {
                int pcheck = 0;
                for(int i =1; i<=st; i++)
                {
                    if(st%i==0)
                        pcheck++;
                }
                if(pcheck==2)
                    System.out.println("The entered number is Prime but not Duck Prime");
                else
                    System.out.println("The entered number is neither Prime nor Duck Prime");
            }
        }
        else
            System.out.println("Only numbers are accepted");    
    }
}
