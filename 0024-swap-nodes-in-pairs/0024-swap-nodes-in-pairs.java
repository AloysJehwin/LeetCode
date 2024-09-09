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
    public ListNode swapPairs(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prevNode=dummy;
        while (head!=null && head.next!=null) {
            ListNode firListNode=head;
            ListNode secListNode=head.next;
            prevNode.next=secListNode;
            firListNode.next=secListNode.next;
            secListNode.next=firListNode;
            prevNode=firListNode;
            head=firListNode.next;
        }
        return dummy.next;
    }
}