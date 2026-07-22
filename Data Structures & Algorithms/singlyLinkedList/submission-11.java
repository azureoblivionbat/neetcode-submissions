class LinkedList {
    private ListNode head;

    public LinkedList() {
        head = null;
    }

    public int get(int index) {
        ListNode current = head;
        int idx = 0;
        int ret = -1;
            while (current != null) {
                if (idx == index) {
                    ret = current.val;
                    break;
                } else if (idx < index) {
                    ++idx;
                }
                current = current.next;
            }
        return ret;
    }

    public void insertHead(int val) {
        ListNode current = new ListNode(val);
        if (head != null) {
            current.next = head;
        }
        head = current;
    }

    public void insertTail(int val) {
        if (head != null){
            ListNode current = head;
            while (current.next != null) current = current.next;
            current.next = new ListNode(val);
        } else {
            head = new ListNode(val);
        }
    }

    public boolean remove(int index) {
        if (head == null){
            return false;
        } else if (head.next == null && index > 0 ){
            return false;
        } if (head.next == null && index == 0 ){
            head = null;
            return true;
        } if (head != null && index ==0) {
        	head = head.next;
        	return true;
        }
        ListNode next = head.next;
        ListNode curr = head;
        ListNode old = head;
        boolean ret = false;
        int idx = 0;
        while (curr != null) {
            if (idx == index) {
                old.next = next;
                ret = true;
                break;
            } else {
                ++idx;
            }
            old = curr;
            curr = curr.next;
            next = next.next;
        }
        return ret;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();
        if(head == null) return values;
        ListNode current = head;
        while (current.next != null) {
            values.add(current.val);
            current = current.next;
        }
        values.add(current.val);
        return values;
    }
    class ListNode {
        Integer val;
        ListNode next = null;
        ListNode(Integer val) {
            this.val = val;
        }
        void setNext(ListNode node) {
            next = node;
        }
    }
}
