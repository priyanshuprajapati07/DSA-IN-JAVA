# Max Consecutive Bit

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array **arr[]** consisting of only  **0’s and 1’s**, return  **count**  of the maximum number of consecutive 1’s or 0’s present in the array. 

 **Examples:** 

```
Input: arr[] = [0, 1, 0, 1, 1, 1, 1]
Output: 4
Explanation: The maximum number of consecutive 1’s in the array is 4 from index 3-6.
```

```
Input: arr[] = [0, 0, 1, 0, 1, 0]
Output: 2
Explanation: The maximum number of consecutive 0’s in the array is 2 from index 0-1.
```

```
Input: arr[] = [0, 0, 0, 0]
Output: 4
Explanation: The maximum number of consecutive 0’s in the array is 4.
```

**Constraints:
**1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 1

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T07:21:20.976Z  

```java
class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
     int count = 1 ;
     int ans = 1;
     for(int i = 1; i<arr.length; i++){
         if(arr[i] == arr[i-1]){
             count++;
             if(count > ans) ans = count;
         }
         else count = 1;
     }
     return ans;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/max-consecutive-one/1)