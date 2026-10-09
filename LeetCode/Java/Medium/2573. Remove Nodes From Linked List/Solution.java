import java.util.Stack;
// Monotonic Stack 
class Solution {
    public ListNode removeNodes(ListNode head) {

        Deque<ListNode> stack = new ArrayDeque<>();
        ListNode temp = head;

        while (temp != null) {

            while (!stack.isEmpty() &&
                   stack.peek().val < temp.val) {
                stack.pop();
            }

            stack.push(temp);
            temp = temp.next;
        }

        ListNode result = null;

        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            node.next = result;
            result = node;
        }

        return result;
    }
}