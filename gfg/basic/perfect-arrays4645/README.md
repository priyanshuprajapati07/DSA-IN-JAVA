# Palindrome Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr[]**, the task is to find whether the  **arr**  is palindrome or not.  An array is said to be palindrome if its reverse array matches the original array. 

 **Examples:** 

```
Input: arr = [1, 2, 3, 2, 1]
Output: true
Explanation: If we reverse, we get [1, 2, 3, 2, 1] which is the same as before. So, the answer is true.

```

```
Input: arr = [1, 2, 3, 4, 5]
Output: false
Explanation:  If we reverse it, we get [5, 4, 3, 2, 1] which is the not same as before. So, the answer false.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T07:03:53.973Z  

```java
class Solution {
    public static boolean isPalindrome(int[] a) {
        // code here
        int n = a.length;
        int i = 0, j = n-1;
        while(i<j){
            if (a[i] != a[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/perfect-arrays4645/1)