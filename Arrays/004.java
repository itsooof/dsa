/*26. Remove Duplicates from Sorted Array */

/* Given an integer array nums sorted in non-decreasing order, 
remove the duplicates in-place such that each unique element appears only once. 
The relative order of the elements should be kept the same. 
Then return the number of unique elements in nums.*/


import java.util.*;

public class Solution {

    static int removeDuplicates(int[] nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,9,4,3,2};
        int k = removeDuplicates(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

/*Time Complexity: O(N)

Space Complexity: O(1) */