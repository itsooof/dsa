# https://www.codingninjas.com/studio/problems/square-root-integral_893351?leftPanelTab=0%3Futm_source%3Dstriver&utm_medium=website&utm_campaign=codestudio_a_zcourse
# Square root of a number

'''BRUTE FORCE'''
def floorSqrt(n):
   ans=0

   for i in range(1,n+1):
      val=i*i
      if val<=n:
         ans=i
      else:
         break
   return ans
n= int(input())
print(floorSqrt(n))


#############################
'''OPTIMAL APPROACH 1'''

def floorSqrt(n):
    low = 1
    high = n
    # Binary search on the answers:
    while low <= high:
        mid = (low + high) // 2
        val = mid * mid
        if val <= n:
            # Eliminate the left half:
            low = mid + 1
        else:
            # Eliminate the right half:
            high = mid - 1
    return high

n = 28
ans = floorSqrt(n)


#############################
'''OPTIMAL APPROACH 2'''

import math

def floorSqrt(n):
    ans = int(math.sqrt(n))
    return ans

n = 28
ans = floorSqrt(n)