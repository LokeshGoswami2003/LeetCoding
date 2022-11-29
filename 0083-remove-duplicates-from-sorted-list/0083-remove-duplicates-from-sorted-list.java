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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
        ListNode pre=head;
        ListNode headp=head.next;
        while(headp!=null){
            if(headp.val!=pre.val){
                pre.next=headp;
                pre=headp;
            }
            headp=headp.next;  
        }
        pre.next=null;
        return head;
    }
}