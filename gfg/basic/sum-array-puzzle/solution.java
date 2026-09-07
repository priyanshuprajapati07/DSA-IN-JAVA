class Solution {
    public void sumArray(int[] arr) {
        // code here
        int sum = 0;
        for(int x:arr) sum +=x;
        for(int i = 0; i<arr.length; i++){
            arr[i] = sum-arr[i];
        }
        
    }
}