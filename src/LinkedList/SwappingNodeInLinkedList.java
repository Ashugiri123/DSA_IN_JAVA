package LinkedList;

public class SwappingNodeInLinkedList {


        public Node swap(Node head, Node first,Node last){
            first.val=first.val+last.val;
            last.val=first.val-last.val;
            first.val=first.val-last.val;
            return head;
        }

        public Node swapNodes(Node head, int k) {
            if(head==null || head.next==null)return head;
            Node fast= head;
            for(int i=0 ; i<k-1;i++){
                fast=fast.next;
            }Node first= fast;
            Node slow=head;
            while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }        Node last= slow;
            if(first.val == last.val)return head;
            return swap(head,first,last);
        }
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
