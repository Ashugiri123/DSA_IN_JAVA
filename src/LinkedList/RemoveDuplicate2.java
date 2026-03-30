package LinkedList;

public class RemoveDuplicate2 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode t1 = new ListNode(-1);
        ListNode t4 = new ListNode(101);
        ListNode t2 = head;
        ListNode t3 = t1;

        while (t2 != null && t2.next != null) {
            if (t2.val != t2.next.val) {
                if (t4.val != t2.val) {
                    t1.next = t2;
                    t1 = t1.next;
                }
                t2 = t2.next;
            } else {
                t4.val = t2.val;
                while (t2.next != null && t2.val == t2.next.val) {
                    t2 = t2.next;
                }
                t2 = t2.next;
            }
        }

        if (t2 != null && t4.val != t2.val) {
            t1.next = t2;
            t1 = t1.next;
        }

        t1.next = null;
        return t3.next;
    }

}
