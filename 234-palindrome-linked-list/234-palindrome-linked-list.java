class Solution {
    public ListNode reverseLinkedListRec(ListNode head) {
        if(head==null || head.next==null)
            return head;
		ListNode reversed = reverseLinkedListRec(head.next);
        ListNode temp=head.next;
        head.next.next=head;
        head.next=null;
        return reversed;
	}
        
     public ListNode midPoint(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null)
            return head;
        while(fast.next!=null){
            if(fast.next.next==null)
                return slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;
        ListNode midnode=midPoint(head);
        ListNode newnodehead=reverseLinkedListRec(midnode.next);
        midnode.next=null;
        
        while(newnodehead!=null){
            if(head.val!=newnodehead.val)
                return false;
            head=head.next;
            newnodehead=newnodehead.next;
        }
        return true;
	}
    
}