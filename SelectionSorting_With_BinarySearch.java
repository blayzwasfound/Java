import java.util.Scanner;//importing scanner

public class SelectionSorting_With_BinarySearch {//class block open
    public static void main(String[] args) {//main block open
        Scanner sc = new Scanner(System.in);//creating scanner object
        System.out.println("Enter 10 elements");//printing statement
        int arr[]= new int[10];//creating an array of space 10
        for(int i = 0; i<arr.length; i++)//entering all the numbers
            arr[i]=sc.nextInt();
        for(int i = 0; i<arr.length-1; i++)//sorting the array using selection sort
        {
            int min = i;
            for(int j = i; j<arr.length; j++)
            {
                if(arr[min]>arr[j])
                    min=j;
            }
            int t = arr[min];
            arr[min] = arr[i];
            arr[i]=t;
        }
        System.out.println("Sorted array");//printing statement
        for(int i = 0; i<arr.length; i++)//printing the sorted array
            System.out.println(arr[i]);
        System.out.println("Enter the element you want to search");//printing statement
        int s = sc.nextInt();//entering the number to be searched
        int start = 0,end = arr.length;//initialising start and end indexes
        for(int i = 0; i<arr.length; i++)//searching using binary search
        {
            int mid = (start+end)/2;
            if(arr[mid]<s)
                start = mid+1;
            else if(arr[mid]>s)
                end=mid-1;
            else
            {
                System.out.println("Element is found at index: "+mid);
                return;
            }
            
        }
        System.out.println("Element not found");
    }
}
