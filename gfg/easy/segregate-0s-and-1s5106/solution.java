class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int zero = 0;
        for(int x:arr) if(x==0) zero++;
        for(int i = 0; i<arr.length; i++){
            if(i < zero) arr[i] = 0;
            else arr[i] = 1;
        }
    }
}
