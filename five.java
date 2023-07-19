/*
 * 189. Rotate Array
Given an integer array nums, rotate the array to the right by k steps, 
where k is non-negative.
 */

public class five {

    void rightRotate(int nums[], int k){
        int[] temp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            temp[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
    }
}    
