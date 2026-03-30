package LinkedList;


public class RemoveNthNode {
    public Node deleteAthead(Node head){
        head=head.next;
        return head;
    }
    public Node removeNthFromEnd(Node head, int n) {

        Node temp1= head;
        if(temp1==null || temp1.next==null)return null;
        for(int i=0;i<n;i++){
            temp1=temp1.next;
            if(temp1==null)return deleteAthead(head);

        }     Node temp2= head;
        while(temp1.next!=null){
            temp1=temp1.next;
            temp2=temp2.next;
        }temp2.next=temp2.next.next;
        return head;}

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

        head.next = b;
        b.next = c;
        c.next = d;
        RemoveNthNode  obj = new RemoveNthNode();

        System.out.print("Original: ");
        printList(head);

        head = obj.removeNthFromEnd(head, 2);

        System.out.print("After removal: ");
        printList(head);
    }

}
