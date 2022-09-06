/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode headpointer=head;
        ListNode headpre=null;
        ListNode headpost=head.next;
        
        while(headpointer!=null){
            headpost=headpointer.next;
            headpointer.next=headpre;
            headpre=headpointer;
            headpointer=headpost;
        }
        return headpre;
    }
}