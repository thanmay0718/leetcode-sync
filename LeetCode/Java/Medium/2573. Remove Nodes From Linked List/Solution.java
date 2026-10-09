import java.util.Stack;

class Solution {
    public ListNode removeNodes(ListNode head) {

        Stack<ListNode> stack = new Stack<>();
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