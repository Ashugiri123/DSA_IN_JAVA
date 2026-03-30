package LinkedList;


//class Node {
//    int val;
//    Node next;
//
//    Node(int val) {
//        this.val = val;
//    }
//}

public class NodeOfLinkedList {
    public static void main(String[] args){
//        Node a= new Node();a.val=10;
//        Node b= new Node();b.val=20;
//        Node c= new Node();c.val=30;
//        Node d= new Node();d.val=40;

        //if you use constructor
        Node Head= new Node(10);
        Node b= new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        System.out.println(Head.val);
        System.out.println(Head.next);
        //connect with other
        Head.next=b;
        b.next=c;
        c.next=d;

        //both the things are same
        System.out.println(c.next);
        System.out.println(Head.next.next.next);
        System.out.println(Head.next.next.next.val);
    }
}

