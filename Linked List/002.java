/*206. Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list.
*/

/*Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1] */


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode crr = head;

        while(crr!=null){
            ListNode next = crr.next;
            crr.next=prev;
            prev=crr;
            crr=next;
        }
        return prev;
    }
}