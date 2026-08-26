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

    private boolean checkNum(int[] nums, int num){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == num){
                return true;
            }
        }
        return false;
    }

    public int numComponents(ListNode head, int[] nums) {
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            if(checkNum(nums,temp.val)){
                if (temp.next == null || !checkNum(nums, temp.next.val)) {
                    count++;
                }
            }
            temp = temp.next;
        }
        return count;
    }
}