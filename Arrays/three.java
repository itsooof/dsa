/*Check if Array Is Sorted and Rotated
 * 
 * Given an array nums, return true if the array was originally 
 * sorted in non-decreasing order, then rotated some number of positions 
 * (including zero). Otherwise, return false.
 */

class Solution {
    public boolean check(int[] nums) {
        int rotates =0;

        for(int i=0;i<nums.length;i++){
          if(nums[i]>nums[(i+1)%nums.length]){
            rotates++;
          }
          if(rotates>1){
            return false;
          }
        }
        return true;
    }
}