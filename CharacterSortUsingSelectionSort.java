import java.util.Scanner;

public class CharacterSortUsingSelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 characters");
        char A[] = new char[10];
        for(int i = 0; i<A.length; i++)
        {
            A[i]= sc.next().charAt(0);
        }
        for(int i = 0; i<A.length-1; i++)
        {
            int max = i;
            for(int j = i; j<A.length; j++)
            {
                if(A[max]<A[j])
                {
                    max=j;
                }
                char temp = A[max];
                A[max]=A[i];
                A[i]=temp;
            }
        }
        System.out.println("The Sorted Characters are");
        for(int i = 0; i<A.length; i++)
        {
            System.out.println(A[i]);
        }
    }
    
}
