import java.util.Scanner;

public class Norm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3x3 matrix");
        int A[][]= new int[3][3];
        for(int i = 0; i<A[0].length; i++)
        {
            for(int j = 0; j<A[0].length; j++)
                A[i][j]=sc.nextInt();
            System.out.println();
        }
        int sumr=0,sumc=0;
        int check = 0;
        for(int i = 0; i<A[0].length; i++)
        {
            for(int j = 0; j<A[0].length; j++){
               sumr+=A[i][j];
               sumc+=A[j][i];}
            if(sumr==sumc)
                check++;
        }
        if(check==3)
            System.out.println("Norm matrix");
        else
            System.out.println("Not a Norm Matrix");
       
    }
}
