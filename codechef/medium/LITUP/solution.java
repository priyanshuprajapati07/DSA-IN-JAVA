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