class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
     int count = 1 ;
     int ans = 1;
     for(int i = 1; i<arr.length; i++){
         if(arr[i] == arr[i-1]){
             count++;
             if(count > ans) ans = count;
         }
         else count = 1;
     }
     return ans;
    }
}
