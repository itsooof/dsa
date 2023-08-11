# 162. Find Peak Element

'''A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. 
If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.'''

'''BRUTE FORCE'''
class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        n=len(nums)

        for i in range(n):
            if(i==0 or nums[i-1]<nums[i]) and (i==n-1 or nums[i]>nums[i+1]):
                return i
        return -1
    

    
#################################################################################
'''OPTIMAL APPROACH'''
class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        n=len(nums)

        if n==1:
            return 0
        if nums[0]>nums[1]:
            return 0
        if nums[n-1]>nums[n-2]:
            return n-1

        low=1
        high=n-2

        while low<=high:
            mid=(low+high)//2

            # If arr[mid] is the peak:
            if nums[mid-1]<nums[mid] and nums[mid]>nums[mid+1]:
                return mid
            
            # If we are in the left:
            if nums[mid]>nums[mid-1]:
                low=mid+1

            # If we are in the right:
            # Or, arr[mid] is a common point:
            else:
                high=mid-1
        return -1