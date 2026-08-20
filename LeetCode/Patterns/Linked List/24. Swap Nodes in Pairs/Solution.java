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

    private ListNode findLastNode(ListNode temp, int k){
        k -= 1;
        while(temp != null && k > 0){
            k--;
            temp = temp.next;
        }
        return temp;
    }

    private ListNode reverse(ListNode temp){
        ListNode prev = null;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return  prev;
    }

    public ListNode swapPairs(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode lastNode = findLastNode(temp, 2);
            if(lastNode == null){
                if(prev != null){
                    prev.next = temp;
                }
                break;
            }
            ListNode nextNode = lastNode.next;
            lastNode.next = null;
            reverse(temp);
            if(temp == head){
                head = lastNode;
            } else {
                prev.next = lastNode;
            }
            prev = temp;
            temp = nextNode;
        }
        return head;
    }
}