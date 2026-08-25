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

    // Brute force because of using extra space
    private ListNode convertedIntoLL(int[] arr){

        if(arr.length == 0){
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode temp =  head;

        for(int i = 1; i < arr.length; i++){
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public ListNode partition(ListNode head, int x) {

        // Stored into list
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        // Placing in partition conditions
        int[] arr = new int[list.size()];
        int k = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < x){
                arr[k++] = list.get(i);
            }
        }

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) >= x){
                arr[k++] = list.get(i);
            }
        }
        return convertedIntoLL(arr);
    }
}