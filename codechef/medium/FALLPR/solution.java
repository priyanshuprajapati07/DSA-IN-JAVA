import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();

            long[] a = new long[N];
            long[] prefix = new long[N];

            for (int i = 0; i < N; i++) {
                a[i] = sc.nextLong();

                if (i == 0) {
                    prefix[i] = a[i];
                } else {
                    prefix[i] = prefix[i - 1] + a[i];
                }
            }

            // Prefix minimum
            long[] prefixMin = new long[N];
            prefixMin[0] = prefix[0];

            for (int i = 1; i < N; i++) {
                prefixMin[i] = Math.min(prefixMin[i - 1], prefix[i]);
            }

            // Suffix minimum
            long[] suffixMin = new long[N];
            suffixMin[N - 1] = prefix[N - 1];

            for (int i = N - 2; i >= 0; i--) {
                suffixMin[i] = Math.min(prefix[i], suffixMin[i + 1]);
            }

            boolean possible = false;

            // No deletion
            if (prefixMin[N - 1] >= 0) {
                possible = true;
            }

            // Try deleting one element
            if (!possible) {

                for (int remove = 0; remove < N; remove++) {

                    // All prefix sums BEFORE removed element
                    // must be non-negative.
                    if (remove > 0 && prefixMin[remove - 1] < 0) {
                        continue;
                    }

                    // Prefix sums after deletion
                    long minimumAfterDeletion =
                            suffixMin[remove] - a[remove];

                    if (minimumAfterDeletion >= 0) {
                        possible = true;
                        break;
                    }
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();

	}
}
