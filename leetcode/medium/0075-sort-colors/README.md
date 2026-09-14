# Sort Colors

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array `nums` with `n` objects colored red, white, or blue, sort them  **in-place** so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

 **Example 1:** 

 **Input:**  nums = [2,0,2,1,1,0]

 **Output:**  [0,0,1,1,2,2]

 **Explanation:** 

The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.

 **Example 2:** 

 **Input:**  nums = [2,0,1]

 **Output:**  [0,1,2]

 **Explanation:** 

The array has one each of 0, 1, and 2, arranged in-place in the order 0, 1, 2.

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 300
- nums[i] is either 0, 1, or 2.

 

 **Follow up:**  Could you come up with a one-pass algorithm using only constant extra space?

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.4 MB (beats 76.09%)  
**Submitted:** 2026-09-14T04:05:36.691Z  

```java
class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
       
        for(int x : nums){
            if(x == 0) zero++;
            else if (x == 1) one++; // Fixed: changed 'if else' to 'else if'
            else two++;
        }

        int k = 0;
        // Fixed: changed '==' to '=' to actually assign the numbers
        for(int i = 1; i <= zero; i++) nums[k++] = 0;
        for(int i = 1; i <= one; i++) nums[k++] = 1;
        for(int i = 1; i <= two; i++) nums[k++] = 2;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/sort-colors/)