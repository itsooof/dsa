/*1672. Richest Customer Wealth */

/*You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. 
Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. 
The richest customer is the customer that has the maximum wealth. */

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int rows = accounts.length;
        int cols = accounts[0].length;
        for(int i=0;i<rows;i++){
            int wealth=0;
            for(int j=0;j<cols;j++){
                wealth+=accounts[i][j];
            }
            maxWealth=Math.max(maxWealth,wealth);
        }
        return maxWealth;
        
    }
}