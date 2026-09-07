class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int pro = 1;
        while(n!=0){
            int last = n%10;
            pro*= last;
            sum +=last;
            n /= 10;
        }
        return pro-sum;
    }
}