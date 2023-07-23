/*83. Remove Duplicates from Unsorted List */
/*Given the head of a unsorted linked list, delete all duplicates such that each element appears only once. 
Return the linked list unsorted as well. */

class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         HashSet<Integer> hs=new HashSet<>();
         Node crr = head;
         Node prev = null;
         while(crr!=null){
             int crrval=crr.data;
             if(hs.contains(crrval)){
                 prev.next=crr.next;
             }else{
                 hs.add(crrval);
                 prev=crr;
             }
             crr=crr.next;
         }
         return head;
    }
}
