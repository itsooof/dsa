/* MAXIMUM CONSECUTIVE ONES*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maximum=0;
        int i=0;
        while(i<nums.length){
            int countones=0;
            while(i<nums.length && nums[i]==1){
                countones++;
                i++;
            }
            maximum=Math.max(maximum,countones);
            i++;
            
        }
        return maximum;
    }
}
