/*Find the Largest element in an array */

/*OPTIMAL APPROACH / RECURSIVE APPROACH

public class one {
    public static void main(String[] args) {
        int arr1[]={2,5,1,3,0};
        System.out.println(findlargestelement(arr1));
    }

    static int findlargestelement(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

Time Complexity: O(N)
Space Complexity: O(1)
*/

/*BRUTE FORCE
 * 
 * 
import java.util.*;
public class tuf {
 
  public static void main(String args[]) {
 
    int arr1[] =  {2,5,1,3,0};
    System.out.println("The Largest element in the array is: " + sort(arr1));
   
    int arr2[] =  {8,10,5,7,9};
    System.out.println("The Largest element in the array is: " + sort(arr2));
  }
  static int sort(int arr[]) {
    Arrays.sort(arr);
    return arr[arr.length - 1];
  }
}
Time Complexity: O(N*log(N))
Space Complexity: O(n)
 */