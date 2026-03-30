package LinkedList;

public class LinkedListCycle {

        public boolean hasCycle(ListNode head) {
            ListNode slow=head;
            ListNode fast=head;
            while(fast != null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow == fast)return true;}
            return false;}
        public static void printList(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static void main(String []args){
            Node head = new Node(10);
            Node b = new Node(20);
            Node c = new Node(30);
            Node d = new Node(40);
            Node e = new Node(50);
            Node f = new Node(60);
            Node g = new Node(70);

            head.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            f.next = g;

            SwappingNodeInLinkedList  obj = new SwappingNodeInLinkedList();

            System.out.print("Original: ");
            printList(head);

            head = obj.swapNodes(head, 2);

            System.out.print("After removal: ");
            printList(head);
        }
    }
