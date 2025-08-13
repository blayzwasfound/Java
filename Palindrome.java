import java.util.Scanner;

public class Palindrome {
    static int palindrome(int n)
    {
        int store = n;
        int rev = 0;
        while(n!=0)
        {
            rev= (rev*10)+(n%10);
            n/=10;
        }
        if(store == rev)
            return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(palindrome(n)==1)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}
