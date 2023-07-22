/*234. Palindrome Linked List
Given the head of a singly linked list, return true if it is a 
palindrome
 or false otherwise. */

 /*Input: head = [1,2,2,1]
Output: true

Input: head = [1,2]
Output: false
*/


package Linked List;

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode ptr=head;
        int num=0;
        int rev=0;
        int mul=1;

        while(ptr!=null){
            num=num*10+ptr.val;
            rev=rev+ptr.val*mul;
            mul*=10;

            ptr=ptr.next;
        }
        return num==rev;
    }
}