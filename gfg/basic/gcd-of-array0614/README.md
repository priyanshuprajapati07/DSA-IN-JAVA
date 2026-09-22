# GCD of Array

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array of n positive integers, find the GCD of all the array elements.

 **Example :** 

```
Input: n = 3, arr = [1, 2, 3]
Output: 1
Explanation: GCD of 1,2,3 is 1.
```

```
Input: n = 4, arr = [2, 4, 6, 8]
Output: 2
Explanation: Greatest common divisor of all the numbers is 2.
```

 **Constraints:** 
1 ≤ N, arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-22T07:30:47.420Z  

```java
class Solution {
    public int hcf(int a , int  b){
        while(b!=0){
            int rem = a%b;
            a = b;
            b = rem;
        }
        return a;
    }
    public int gcd(int n, int arr[]) {
        // code here.
        if(arr.length == 1) return arr[0];
        int ans = hcf(arr[0], arr[1]);
        for(int i = 2; i<arr.length; i++){
            ans = hcf(ans,arr[i]);
        }
        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/gcd-of-array0614/1)