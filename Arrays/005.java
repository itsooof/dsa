/*
 * 189. Rotate Array
Given an integer array nums, rotate the array to the right by k steps, 
where k is non-negative.
 */

 /*
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
*/

import java.util.*;

class Solution{
    static void leftRotate(int[] nums,int n){
        int temp=nums[0];
        for(int i=0;i<n-1;i++){
            nums[i]=nums[i+1];
        }
        nums[n-1]=temp;
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
    }
}

/*Time Complexity: O(n), as we iterate through the array only once.

Space Complexity: O(1) as no extra space is used */