/*152. Maximum Product Subarray : KADANE'S ALGO */

class Solution {
    public int maxProduct(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++) {
            int temp = 1;
            for(int j = i; j < nums.length; j++) {
                temp *= nums[j];
                
                max = Math.max(max, temp);
            }
        }
        
        return max;
    }
}