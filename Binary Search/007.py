# 540. Single Element in a Sorted Array

''' You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

'''
'''BRUTE FORCE'''
class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        n=len(nums)
        if n==1:
            return nums[0]

        for i in range(n):
            if i==0:
                if nums[i]!=nums[i+1]:
                    return nums[i]
            
            elif i==n-1:
                if nums[i]!=nums[i-1]:
                    return nums[i]
            
            else:
                if nums[i]!=nums[i-1] and nums[i]!=nums[i+1]:
                    return nums[i]
        return -1



############################################
'''OPTIMAL APPROACH'''
class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        n=len(nums)

        if n==1:
            return nums[0]
        if nums[0]!=nums[1]:
            return nums[0]
        if nums[n-1]!=nums[n-2]:
            return nums[n-1]

        low=1
        high=n-2 
        while low<=high:
            mid=(low+high)//2

            if nums[mid]!=nums[mid+1] and nums[mid]!=nums[mid-1]:
                return nums[mid]
            
            if (mid%2==1 and nums[mid]==nums[mid-1]) or (mid%2==0 and nums[mid]==nums[mid+1]):
                low=mid+1
            else:
                high=mid-1
        return -1