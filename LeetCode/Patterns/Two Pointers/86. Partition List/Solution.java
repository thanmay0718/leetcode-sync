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
        ListNode less = new ListNode(-1);
        ListNode high = new ListNode(-1);
        ListNode l = less;
        ListNode h = high;

        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                l.next = new ListNode(temp.val);
                l = l.next;
            } else {
                h.next = new ListNode(temp.val);
                h = h.next;
            }
            temp = temp.next;
        }
        l.next = high.next;
        h.next = null;
        return less.next;
    }
}