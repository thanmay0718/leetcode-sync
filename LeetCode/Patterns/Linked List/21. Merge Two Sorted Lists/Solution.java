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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode l = list1;
        while(l != null){
            arr.add(l.val);
            l = l.next;
        }

        ListNode r = list2;
        while(r != null){
            arr.add(r.val);
            r = r.next;
        }

        Collections.sort(arr);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        for(int i = 0; i < arr.size(); i++){
            temp.next = new ListNode(arr.get(i));
            temp = temp.next;
        }
        return dummy.next;
    }
}