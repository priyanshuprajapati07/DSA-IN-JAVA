class Solution {
    public static boolean isPalindrome(int[] a) {
        // code here
        int n = a.length;
        int i = 0, j = n-1;
        while(i<j){
            if (a[i] != a[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
