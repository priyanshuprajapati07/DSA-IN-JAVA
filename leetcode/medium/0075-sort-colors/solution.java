class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
       
        for(int x : nums){
            if(x == 0) zero++;
            else if (x == 1) one++; // Fixed: changed 'if else' to 'else if'
            else two++;
        }

        int k = 0;
        // Fixed: changed '==' to '=' to actually assign the numbers
        for(int i = 1; i <= zero; i++) nums[k++] = 0;
        for(int i = 1; i <= one; i++) nums[k++] = 1;
        for(int i = 1; i <= two; i++) nums[k++] = 2;
    }
}
