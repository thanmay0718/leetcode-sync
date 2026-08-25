class MyLinkedList {

    private class ListNode{
        int val;
        ListNode next;
        public ListNode (int val){
            this.val = val;
            this.next = null;
        }
    }

    private final ListNode head;
    private int size;

    public MyLinkedList() {
        head = new ListNode(0);
        size = 0;    
    }
    
    public int get(int index) {
        if(index < 0 || index > size){
            return -1;
        }

        ListNode temp = head.next;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index > size || index < 0){
            return;
        }

        ListNode cur = head;
        for(int i = 0; i < index; i++){
            cur = cur.next;
        }
        ListNode newNode = new ListNode(val);
        cur.next = newNode;
        newNode.next = cur.next;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index > size || index < 0){
            return;
        }

        ListNode curr = head;
        for(int i = 0; i < index; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */