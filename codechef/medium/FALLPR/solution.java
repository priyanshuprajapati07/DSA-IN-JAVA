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

            // Input + prefix sum
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextLong();

                if (i == 0)
                    prefix[i] = a[i];
                else
                    prefix[i] = prefix[i - 1] + a[i];
            }

            // Already good?
            boolean good = true;

            for (int i = 0; i < N; i++) {
                if (prefix[i] < 0) {
                    good = false;
                    break;
                }
            }

            if (good) {
                System.out.println("YES");
                continue;
            }

            // suffix minimum of prefix sums
            long[] suffixMin = new long[N];

            suffixMin[N - 1] = prefix[N - 1];

            for (int i = N - 2; i >= 0; i--) {
                suffixMin[i] = Math.min(prefix[i], suffixMin[i + 1]);
            }

            boolean possible = false;

            for (int remove = 0; remove < N; remove++) {

                // Prefix before removed element must already be >= 0
                if (remove > 0 && prefix[remove - 1] < 0)
                    continue;

                // After removing a[remove],
                // every later prefix becomes prefix[i] - a[remove]
                if (suffixMin[remove] - a[remove] >= 0) {
                    possible = true;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
