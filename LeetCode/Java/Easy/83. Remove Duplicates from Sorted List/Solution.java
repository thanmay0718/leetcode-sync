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

    // Brute Force
    private ListNode convertToDLL(Set<Integer> set){
        ListNode head = null;
        ListNode temp = null;

        for (int value : set) {

            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }
        return head;
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        Set<Integer> set = new TreeSet<>();
        while(temp != null){
            set.add(temp.val);
            temp = temp.next;
        }
        return convertToDLL(set);
    }
}