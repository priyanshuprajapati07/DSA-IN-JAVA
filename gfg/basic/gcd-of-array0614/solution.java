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