class Solution {
    void segregate0and1(int[] arr) {
        // code here
        // int left = 0;
        // int right = arr.length-1;
        
        // while(left<right){
        //     if(arr[left]==1 && arr[right]==0){
        //         //swap
        //         arr[left] =0;
        //         arr[right] = 1;
        //     }
        //     if(arr[left]==0) left++;
        //     if(arr[right]==1) right--; 
        // }
        Arrays.sort(arr);
    }
}
