/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int x = 0;
        int y = 0;
        int sum = 0;
        ListNode sumHeadNode = new ListNode(0);
        ListNode sumNode = sumHeadNode;
        ListNode p = l1;
        ListNode q = l2;
        while(p!=null || q!=null){
            x = (p==null?0:p.val);
            y = (q==null?0:q.val);
            sum = x + y + carry;
            carry = sum/10;
            sumNode.next = new ListNode(sum % 10);
            sumNode = sumNode.next;
            p = (p==null?null:p.next);
            q = (q==null?null:q.next);
            
            
        }
        if(carry!=0)
            sumNode.next = new ListNode(carry);
        return sumHeadNode.next;
        
    }
}
