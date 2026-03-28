package LinkedList;

public class DeleteTheMiddleNode {

    public Node deleteMiddle(Node head) {
        if (head == null || head.next == null)
            return null;

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;
        return head;
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        head.next = b;
        b.next = c;
        c.next = d;

        DeleteTheMiddleNode obj = new DeleteTheMiddleNode();

        System.out.print("Original: ");
        printList(head);

        head = obj.deleteMiddle(head);

        System.out.print("After deletion: ");
        printList(head);
    }
}
