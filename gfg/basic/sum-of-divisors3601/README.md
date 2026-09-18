# Sum of Divisors

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a natural number n, calculate sum of all its proper divisors. A proper divisor of a natural number is the divisor that is strictly less than the number.

 **Examples:** 

```
Input: n = 10
Output: 8 
Explanation: Proper divisors 1 + 2 + 5 = 8. 

```

```
Input: n = 6
Output: 6
Explanation: Proper divisors 1 + 2 + 3 = 6. 

```

 **Constraints:** 
2<= n <=106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T08:54:38.677Z  

```java
class Solution {
    static long divSum(long n) {
        // code here
        int sum = 0;
        for(int i = 1; i<n; i++){
            if(n%i == 0) sum+=i;
        }
        return sum;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sum-of-divisors3601/1)