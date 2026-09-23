import java.io.*;
import java.util.*;


public class Main {
    public static void SecondLargest(int[] arr, int n) {
        // Handle edge case where array size is less than 2
        if (n < 2) {
            System.out.println(-1);
            return;
        }

        // Initialize trackers manually using the first element
        int largest = arr[0];
        
        // Use a flag to track if we have found a valid second largest number yet
        int secondLargest = -1; 
        boolean hasSecondLargest = false;

        for (int i = 1; i < n; i++) {
            int current = arr[i];

            // Case 1: Current element is greater than the largest found so far
            if (current > largest) {
                secondLargest = largest;
                largest = current;
                hasSecondLargest = true;
            } 
            // Case 2: Current element is strictly between largest and second largest
            else if (current != largest) {
                if (!hasSecondLargest || current > secondLargest) {
                    secondLargest = current;
                    hasSecondLargest = true;
                }
            }
        }

        // Output the result based on the tracking flag
        if (hasSecondLargest) {
            System.out.println(secondLargest);
        } else {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
        SecondLargest(arr,n);
        sc.close();
        
    }
}
