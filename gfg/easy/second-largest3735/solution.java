class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int first = arr[0];
        for(int i = 0; i <arr.length; i++){
                if(first<arr[i]) first=arr[i];
        }
        
        int second = 0;
        
         for(int i = 0; i <arr.length; i++){
             if(arr[i] == first) continue;
             if(second<arr[i]) second=arr[i];
        }
        
        return second ==0? -1:second;
        
    }
}