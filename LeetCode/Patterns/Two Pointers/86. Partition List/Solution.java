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
    // Optimized - by using two dummy lists and at the end connecting them without any  extra spaces so, O(1) Space
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode great = new ListNode(0);
        ListNode lessPointer = less;
        ListNode greatPointer = great;

        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                lessPointer.next = temp;
                lessPointer = lessPointer.next; 
            } else {
                greatPointer.next = temp;
                greatPointer = greatPointer.next;
            }
            temp = temp.next;
        }
        lessPointer.next = great.next;
        greatPointer.next = null;
        return less.next;
    }
}