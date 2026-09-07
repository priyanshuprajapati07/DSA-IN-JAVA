# Calculate Money in Leetcode Bank

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Hercy wants to save money for his first car. He puts money in the Leetcode bank  **every day**.

He starts by putting in `$1` on Monday, the first day. Every day from Tuesday to Sunday, he will put in `$1` more than the day before. On every subsequent Monday, he will put in `$1` more than the  **previous Monday**.

Given `n`, return  *the total amount of money he will have in the Leetcode bank at the end of the* `nth` *day.* 

 

 **Example 1:** 

```
Input: n = 4
Output: 10
Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.

```

 **Example 2:** 

```
Input: n = 10
Output: 37
Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.

```

 **Example 3:** 

```
Input: n = 20
Output: 96
Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.

```

 

 **Constraints:** 

- 1 <= n <= 1000

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 64.76%)  
**Memory:** 41.8 MB (beats 91.08%)  
**Submitted:** 2026-09-07T09:25:30.177Z  

```java
class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int mondayMoney = 1;
        int currentMoney = 1;
        
        for (int day = 1; day <= n; day++) {
            total += currentMoney;
            currentMoney++;
            
            if (day % 7 == 0) {
                mondayMoney++;
                currentMoney = mondayMoney;
            }
        }
        return total;
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/calculate-money-in-leetcode-bank/)