import java.io.*;
import java.util.*;


public class Main {
    public static void SecondLargest(int[] arr, int n) {
        // Handle edge case where array size is less than 2
        if (n < 2) {
            System.out.println(-1);
            return;
        }

        // Initialize variables with the smallest possible integer value
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int current = arr[i];

            // Case 1: Current element is greater than the largest found so far
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } 
            // Case 2: Current element is strictly between largest and second largest
            else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        // If secondLargest was never updated, it means all elements were identical
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(secondLargest);
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
