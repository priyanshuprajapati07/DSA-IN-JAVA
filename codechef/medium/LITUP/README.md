# LITUP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Lit Up

A fair has $N$ stalls in a row, numbered $1$ to $N$ from left to right.

The fair organizers now need to put up some floodlights, so that the stalls can operate well even at night.
It costs the organizers $C_i$ coins to install a floodlight on top of the $i$-th stall.

Each floodlight has a power of $K$, meaning that it will illuminate all stalls at distance at most $K$ from it.
That is, if a floodlight is placed on top of stall $i$, it will illuminate stall $j$ if and only if $|i-j| \le K$.

In order to save money, the organizers decide that they will put up  **exactly two**  floodlights, on two distinct stalls.

Find the minimum possible cost of placing two floodlights, such that every stall is illuminated by at least one floodlight.
If it's impossible to place two floodlights and light up all the stalls, print $-1$ instead.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains two space-separated integers $N$ and $K$ — the number of stalls and the power of each light. The second line contains $N$ space-separated integers $C_1, \ldots, C_N$.
### Output Format

For each test case,

- If it's not possible to place exactly two lights to illuminate all $N$ stalls, print $-1$.
- Otherwise, output the minimum total cost of placing two lights to illuminate all $N$ stalls.
### Constraints
- $1 \leq T \leq 100$
- $2 \leq N \leq 100$
- $1 \le K \le N$
- $1 \le C_i \le 100$
### Sample 1:
Input
Output

```
4
5 1
1 8 1 4 7
3 1
6 2 2
6 3
9 4 2 7 2 6
7 1
4 1 7 3 6 1 5

```

```
5
4
4
-1
```

### Explanation:

 **Test case $1$:**  We can place lights on top of stalls $1$ and $4$, for a cost of $C_1 + C_4 = 1+4 = 5$.
This will illuminate all stalls, because, with $K = 1$:

- The light at $1$ will illuminate stalls $1, 2$.
- The light at $4$ will illuminate stalls $3, 4, 5$.

$5$ is the minimum cost needed to achieve this.

 **Test case $2$:**  Place lights on stalls $2$ and $3$, for a cost of $A_2 + A_3 = 4$.

 **Test case $4$:**  No matter how two lights are placed, with a power of $K = 1$ at least one stall will not be illuminated. So we print $-1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-23T16:09:54.292Z  

```java
# cook your dish here
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // Segment Tree class to perform efficient Range Minimum Queries (RMQ)
    static class SegmentTree {
        int n;
        long[] tree;

        SegmentTree(long[] arr) {
            this.n = arr.length;
            this.tree = new long[4 * n];
            build(arr, 0, 0, n - 1);
        }

        void build(long[] arr, int node, int start, int end) {
            if (start == end) {
                tree[node] = arr[start];
                return;
            }
            int mid = (start + end) / 2;
            build(arr, 2 * node + 1, start, mid);
            build(arr, 2 * node + 2, mid + 1, end);
            tree[node] = Math.min(tree[2 * node + 1], tree[2 * node + 2]);
        }

        long query(int node, int start, int end, int l, int r) {
            if (r < start || end < l) {
                return Long.MAX_VALUE; // Out of bounds
            }
            if (l <= start && end <= r) {
                return tree[node];
            }
            int mid = (start + end) / 2;
            long p1 = query(2 * node + 1, start, mid, l, r);
            long p2 = query(2 * node + 2, mid + 1, end, l, r);
            return Math.min(p1, p2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            long[] c = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                c[i] = Long.parseLong(st.nextToken());
            }

            // Build the Segment Tree for Range Minimum Query
            SegmentTree stree = new SegmentTree(c);

            long minTotalCost = Long.MAX_VALUE;

            // Valid range for the right floodlight (j) using 0-based indexing:
            // j must be at least N - 1 - K and at most N - 1
            int minJ = Math.max(0, n - 1 - k);

            for (int j = minJ; j < n; j++) {
                // Determine the valid 0-indexed range [L, R] for the left floodlight (i)
                int l = Math.max(0, j - 2 * k - 1);
                int r = Math.min(j - 1, k);

                if (l <= r) {
                    long minLeftCost = stree.query(0, 0, n - 1, l, r);
                    if (minLeftCost != Long.MAX_VALUE) {
                        minTotalCost = Math.min(minTotalCost, c[j] + minLeftCost);
                }
                }
            }

            // If no valid configuration was found, output -1
            if (minTotalCost == Long.MAX_VALUE) {
                sb.append("-1\n");
            } else {
                sb.append(minTotalCost).append("\n");
            }
        }
        System.out.print(sb);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LITUP)