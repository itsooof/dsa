/* Add 1 to a number represented as linked list*/

/*https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1 */

/*A number N is represented in Linked List such that each digit corresponds to a node in linked list. 
You need to add 1 to it. */

/*input: 9->9->9
output: 1->0->0->0
 */

 class Solution{
    public Node reverse(Node head){
        Node prev = null;
        Node next = null;
        Node crr = head;
        while(crr!=null){
            next=crr.next;
            crr.next=prev;
            prev=crr;
            crr=next;
        }
        return reverse;
    }

    public Node addOne(Node head){
        Node new_head=reverse(head);
        Node crr=new_head;
        Node prev = null;
        Node crr1 = new_head;

        int carry=0;
        while(crr!=null){
            int sum=0;
            if(prev==null){
                sum=crr.val+1;
            }else{
                sum=crr.val+carry;
            }
            crr=sum/10;
            crr.val=sum%10;
            prev=crr;
            crr=crr.next;
        }
        if(carry==1){
            Node new_node = new Node(1);
            prev.next=new_node;
        }
        return reverse(crr1);
    }
 }