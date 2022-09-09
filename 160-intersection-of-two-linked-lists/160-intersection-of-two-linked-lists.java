/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        while(headB!=null){
            headA=a;
        while(headA!=null){
            if(headA==headB)
                return headA;
            headA=headA.next;
        }
            headB=headB.next;
        }
        return null;
    }
}