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
    public ListNode partition(ListNode head, int x) {
        ListNode lessNode=new ListNode(0);
        ListNode greaterNode=new ListNode(0);
        ListNode less=lessNode;
        ListNode greater=greaterNode;
        while (head!=null) {
            if(head.val<x){
                less.next=head;
                less=less.next;
            }else{
                greater.next=head;
                greater=greater.next;
            }
            head=head.next;
        }
        greater.next=null;
        less.next=greaterNode.next;
        return lessNode.next;
    }
}