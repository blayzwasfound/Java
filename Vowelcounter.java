import java.util.Scanner;//importing Scanner
public class Vowelcounter {//class block opens
    public static void main(String[] args) {//main block opens
        Scanner sc = new Scanner(System.in);//creating Scanner object
        System.out.println("Enter a sentence");//printing statement
        String a = sc.nextLine().toUpperCase();//accepting a sentence and converting to uppercase
        int c =0;//intialising the counter value to 0
        for(int i= 0; i<a.length(); i++)//loop for extracting words
        {
            if("AEIOU".indexOf(a.charAt(i))!=-1)//checking if its a vowel
                c++;//incrementing the counter value by 1
        }
        System.out.println("The number of vowels in the sentence is: "+c);//printing statement
    }
}
