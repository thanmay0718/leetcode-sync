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
/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        // Time Complexity : O(k + n)
        // Space Complexity : O(1)

        if(head == null || head.next == null || k == 0)
            return head;

        ListNode temp = head;
        int len = 1;

        while(temp.next != null){
            temp = temp.next;
            len++;
        }

        k = k % len;

        if(k == 0) return head;

        temp.next = head;
        int steps = len - k;
        ListNode newtail = head;
        for(int i = 1; i < steps; i++){
            newtail = newtail.next;
        }
        ListNode newHead = newtail.next;
        newtail.next = null;
        return newHead;
    }
}