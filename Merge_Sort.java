/*Merge Sort is a divide and conquers algorithm, it divides the given array into equal parts and then merges the 2 sorted parts. 
There are 2 main functions :
merge(): This function is used to merge the 2 halves of the array. It assumes that both parts of the array are sorted and merges both of them.
mergeSort(): This function divides the array into 2 parts. low to mid and mid+1 to high where, */

import java.util.*;

class Solution {
    private static void mergeSort(int arr[], int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;  // starting index of left half of arr
        int right = mid+1; // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//
        while(left<=mid && right <=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        // if elements on the left half are still left //

        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }

        // if elements on the right half are still left //
        while (right<=high){
            temp.add(arr[right]);
            right++;
        }
         // transfering all elements from temporary to arr //

         for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    public static void merge(int[] arr, int low, int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        merge(arr, low, mid);
        merge(arr, mid+1, high);
        mergeSort(arr, low, mid, high);

    }
}

public class Merge_Sort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Solution.merge(arr, 0, n - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
