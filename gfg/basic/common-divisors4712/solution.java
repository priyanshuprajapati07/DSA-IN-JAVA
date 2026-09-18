class Solution {
    int commDiv(int a, int b) {
        // Step 1: Find GCD directly using Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int g = a; // g is now the GCD of a and b

        // Step 2: Count divisors of g
        int count = 0;
        for (int i = 1; i * i <= g; i++) {
            if (g % i == 0) {
                if (i * i == g) {
                    count += 1; // Perfect square case
                } else {
                    count += 2; // Pair of divisors
                }
            }
        }

        return count;
    }
}
