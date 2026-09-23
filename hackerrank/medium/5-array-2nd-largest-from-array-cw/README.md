# 5. Array - 2nd Largest from array (CW)

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an unsorted array of size N find the 2nd largest element from the array without sorting the array.

 **Input Format** 

The first line contains a single integer N.

The second line consists of N integers of the array.

 **Constraints** 

2 <= N <= 10^5

-10^5 <= N <= 10^5

 **Output Format** 

Print the second largest number in the new line.

Example 1

Input

6

3 2 1 5 6 4

Output

5

Explanation

5 is the second largest element of the array.

Example 2

Input

9

10 7 2 5 6 8 9 3 10

Output

9

Explanation

9 is the Second largest element in the array

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T04:11:51.124Z  

```java
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

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/5-array-2nd-largest-from-array-cw/problem)