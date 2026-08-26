class Solution {

    private boolean checkNum(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                return true;
            }
        }
        return false;
    }

    public int numComponents(ListNode head, int[] nums) {

        int count = 0;
        ListNode temp = head;

        while (temp != null) {

            // Current node belongs to nums
            if (checkNum(nums, temp.val)) {

                // If next node is null OR next node is not in nums,
                // this component ends here.
                if (temp.next == null || !checkNum(nums, temp.next.val)) {
                    count++;
                }
            }

            temp = temp.next;
        }

        return count;
    }
}