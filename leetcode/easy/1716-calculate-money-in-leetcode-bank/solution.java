class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int mondayMoney = 1;
        int currentMoney = 1;
        
        for (int day = 1; day <= n; day++) {
            total += currentMoney;
            currentMoney++;
            
            if (day % 7 == 0) {
                mondayMoney++;
                currentMoney = mondayMoney;
            }
        }
        return total;
    }
}
