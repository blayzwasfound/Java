import java.util.Scanner;//importing scanner
import java.util.regex.*;//importing regex functions
public class emailvalidator
{//class start
    public static void main(String[] args) {//main start
        Scanner sc = new Scanner(System.in);//scanner object
        System.out.println("Enter an email id to check");
        String email = sc.next();//accepting the input
        Pattern pattern = Pattern.compile("@");//making a pattern
        Pattern pattern2 = Pattern.compile(".");//making another pattern
        Matcher matcher = pattern.matcher(email);//match condition 1
        Matcher matcher2 = pattern2.matcher(email);//match condition 2
        if(matcher.find() && matcher2.find())
            System.out.println("Correct email address");
        else
            System.out.println("Incorrect email address");
    }
}
