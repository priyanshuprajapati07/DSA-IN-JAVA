class Solution {
    public int trailingZeroes(int n) {
    //     int fact = 1;
    //     for (int i = 1; i<=n; i++){
    //         fact *=i;
    //     }
    //     int count = 0;
    //     while(fact!=0){
    //         int last = fact%10;
    //         fact = fact/10;
    //         if(last == 0){
    //             count++;
    //         }
    //     }
    //    return count++;

    int ans = 0;
    while(n>=5){
        n = n /5;
        ans +=n;
    }
    return ans;
    }
}