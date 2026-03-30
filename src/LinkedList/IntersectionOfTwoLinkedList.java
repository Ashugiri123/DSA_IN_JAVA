package LinkedList;

public class IntersectionOfTwoLinkedList {

        public Node getIntersectionNode(Node headA, Node headB) {
            Node temp1 = headA;
            int count1 = 0;
            while (temp1 != null) {
                count1++;
                temp1 = temp1.next;
            }
            Node temp2 = headB;
            int count2 = 0;
            while (temp2 != null) {
                count2++;
                temp2 = temp2.next;
            }
            temp1 = headA;
            temp2 = headB;
            if (count2 > count1) {
                for (int i = 0; i < count2 - count1; i++) {
                    temp2 = temp2.next;
                }
            }
            if (count2 < count1) {
                for (int i = 0; i < count1 - count2; i++) {
                    temp1 = temp1.next;
                }
            }
            while (temp1 != null) {
                if (temp1 == temp2) return temp1;
                else {
                    temp1 = temp1.next;
                    temp2 = temp2.next;
                }
            }
            return null;
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


            Node common1 = new Node(30);
            Node common2 = new Node(40);
            Node common3 = new Node(50);

            common1.next = common2;
            common2.next = common3;

            Node headA = new Node(10);
            Node a2 = new Node(20);
            headA.next = a2;
            a2.next = common1;


            Node headB = new Node(99);
            Node b2 = new Node(88);
            Node b3 = new Node(77);
            headB.next = b2;
            b2.next = b3;
            b3.next = common1;

            IntersectionOfTwoLinkedList obj = new IntersectionOfTwoLinkedList();

            System.out.print("List A: ");
            printList(headA);

            System.out.print("List B: ");
            printList(headB);

            Node intersection = obj.getIntersectionNode(headA, headB);

            if (intersection != null)
                System.out.println("Intersection at node value: " + intersection.val);
            else
                System.out.println("No intersection");
        }
    }
