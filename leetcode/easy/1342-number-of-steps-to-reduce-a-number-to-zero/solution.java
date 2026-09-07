class Solution {
    public int numberOfSteps(int num) {
        // Base case: if number is 0, it takes 0 steps
        if (num == 0) return 0;
        
        // Recursive case: add 1 step and call function again
        if (num % 2 == 0) {
            return 1 + numberOfSteps(num / 2);
        } else {
            return 1 + numberOfSteps(num - 1);
        }
    }
}
