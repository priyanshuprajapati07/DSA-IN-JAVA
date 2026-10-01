# SANDWICH7 - Rating 303

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Sandwiches

Chef is running a sandwich shop. He has $B$ pieces of bread, $H$ pieces of ham, and $C$ pieces of cheese.

To make a sandwich, Chef uses $2$ pieces of bread, and one piece of either ham or cheese, not both.

Find the maximum number of sandwiches Chef can make.

### Input Format
- The first line contains $3$ integers - $B$, $H$ and $C$.
### Output Format

Output the maximum number of sandwiches Chef can make.

### Constraints
- $1 \le B, H, C \le 10$
### Sample 1:
Input
Output

```
8 3 1

```

```
4

```

### Explanation:

Chef can make $3$ ham sandwiches, and $1$ cheese sandwich, using exactly $8$ pieces of bread, $3$ pieces of ham, and $1$ piece of cheese.

### Sample 2:
Input
Output

```
3 2 2

```

```
1

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-01T03:56:08.298Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int h = sc.nextInt();
		int c = sc.nextInt();
		
		int ans1 = b/2;
		int ans2 = h+c;
		if(ans1<ans2) System.out.println(ans1);
		else System.out.println(ans2);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SANDWICH7)