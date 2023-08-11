# 153. Find Minimum in Rotated Sorted Array

'''Suppose an array of length n sorted in ascending order is rotated between 1 and n times. 
For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time. '''

class Solution:
    def findMin(self, nums: List[int]) -> int:
        low=0
        n=len(nums)
        high=n-1
        ans=sys.maxsize

        while low<=high:
            mid=(low+high)//2

            if nums[low]<=nums[mid]: # if left part is sorted
                ans=min(ans,nums[low]) # keep the minimum
                low=mid+1 # eliminate left half
            else:  # if right part is sorted
                ans=min(ans,nums[mid])   # keep the minimum
                high=mid-1   # eliminate right half
        return ans