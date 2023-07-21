/*Find Second Smallest and Second Largest Element in an array */
/*Print ‘-1’ in the event that either of them doesn’t exist. */


/*Solution 1: (Brute Force) [this approach only works if there are no duplicates]

import java.util.*;
public class Solution{
    static private void getElements(int[] arr,int n){
        if(n==0||n==1){
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }
        Arrays.sort(arr);
        int small = arr[1];
        int large = arr[n-2];
        System.out.println(small);
        System.out.print(large);
    }


    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n = arr.length;
        getElements(arr,n);
    }
}
Time Complexity: O(NlogN), For sorting the array
Space Complexity: O(1)
 */

 /*OPTIMAL APPROACH
  * 


import java.io.*;
class Solution
{
static private int secondSmallest(int[] arr, int n)
{
	if (n < 2)
	{
		return -1;
	}
	int small = Integer.MAX_VALUE;
	int second_small = Integer.MAX_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
	   if (arr[i] < small)
	   {
		  second_small = small;
		  small = arr[i];
	   }
	   else if (arr[i] < second_small && arr[i] != small)
	   {
		  second_small = arr[i];
	   }
	}
   return second_small;
}
static private int secondLargest(int[] arr, int n)
{
	if(n<2)
	return -1;
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
		if (arr[i] > large)
		{
			second_large = large;
			large = arr[i];
		}

		else if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}
	}
	return second_large;
}

public static void main(String[] args)
{
	int[] arr = {1, 2, 4, 7, 7, 5};
	int n = arr.length;
		int sS = secondSmallest(arr, n);
		int sL = secondLargest(arr, n);
	System.out.println("Second smallest is "+sS);
	System.out.println("Second largest is "+sL);
}

}

Time Complexity: O(N), Single-pass solution

Space Complexity: O(1)
  */