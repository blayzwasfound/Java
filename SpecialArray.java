import java.util.Scanner;//importing Scanner

public class SpecialArray {//opening class block
    public static void main(String[] args) {//opening main block
        Scanner sc = new Scanner(System.in);//creating scanner object
        System.out.println("Enter a 5x5 array");//printing statement
        int A[][]= new int[5][5];//creating a 5x5 space
        for(int i = 0; i<A[0].length; i++)//outer loop
        {
            for(int j = 0; j<A[0].length; j++)//inner loop
                A[i][j]=sc.nextInt();//accepting the numbers
            System.out.println();//printing blank space
        }
        System.out.println("Your entered array is");//printing statement
        for(int i = 0; i<A[0].length; i++)//outer loop
        {
            for(int j = 0; j<A[0].length; j++)//inner loop
                System.out.print(A[i][j]+" ");//printing the array elements
            System.out.println();//printing blank space
        }
        int so = 0, se = 0;//initialising sum of odd and even values to 0
        for(int i = 0; i<A[0].length; i++)//outer loop
        {
            for(int j = 0; j<A[0].length; j++)//inner loop
            {
                if(A[i][j]%2==0)
                    se+=A[i][j];//adding the even elements
                else
                    so+=A[i][j];//adding the odd elements
            }
        }
        System.out.println((se==so)?"Special Array":"Not special array");//printing statement
    }//closing main block
}//closing class block
