class Solution {
    public int trailingZeroes(int n) {
        int fact = 1;
        for (int i = 1; i<=n; i++){
            fact *=i;
        }
        int count = 0;
        while(fact<=n){
            int last = fact%10;
            fact = fact/10;
            if(last == 0){
                count++;
            }
        }
       return count++;
    }
}