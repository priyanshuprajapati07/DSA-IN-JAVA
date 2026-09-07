class Solution {

    public int countDigits(int n){
        int digits = 0;
        while(n!=0){
            digits++;
            n/=10;
        }
        return digits;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for(int x:nums){
            if(countDigits(x)%2==0) count++;
        }
        return count;
    }
}