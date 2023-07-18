/*Find Second Smallest and Second Largest Element in an array */
/*Print ‘-1’ in the event that either of them doesn’t exist. */

import java.util.*;

public class two{
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
