/*268. Missing Number
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            
            sum= sum + nums[i];
            
        }
        int n=nums.length;
        int formula = (n*(n+1)/2);
        int diff = formula - sum;
        return diff;
    }
    
}
