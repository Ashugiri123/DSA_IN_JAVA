package LinkedList;

class Linkedlist {
    Node Head;
    Node tail;
    int size;

    void addAtTail(int val) {
        Node temp = new Node(val);
        if (tail == null) {
            Head = tail = temp;
        } else {tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void deleteAtTail() {
        if (Head == null) {
            System.out.println("empty list");
            return;
        }

        if (size == 1) {           // VERY IMPORTANT FIX
            Head = tail = null;
            size = 0;
            return;
        }

        Node temp = Head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;
    }

    void addAtHead(int val){
        Node temp  = new Node(val);
        if(Head == null) {
            Head = tail = temp;
        } else {
            temp.next = Head;
            Head = temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(Head == null){
            System.out.println("empty list");
            return;
        }

        if(size == 1){
            Head = tail = null;
            size = 0;
            return;
        }

        Head = Head.next;
        size--;
    }

    void insert(int val,int idx){
        if(idx < 0 || idx > size){
            System.out.println("invalid index");
            return;
        }

        if(idx == 0){
            addAtHead(val);
            return;
        }

        if(idx == size){
            addAtTail(val);
            return;
        }

        Node temp = Head;
        for(int i = 0; i < idx - 1; i++){
            temp = temp.next;
        }

        Node t = new Node(val);
        t.next = temp.next;
        temp.next = t;
        size++;
    }

    void delete(int idx){
        if(idx < 0 || idx >= size) return;

        if(idx == 0){
            deleteAtHead();
            return;
        }

        if(idx == size - 1){
            deleteAtTail();
            return;
        }

        Node temp = Head;
        for(int i=0;i<idx-1;i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }

    int search(int val){
        Node temp = Head;
        int idx = 0;

        while(temp != null){
            if(temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    void display() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


public class LinkedListDatastructure {
    public static void main(String[] args) {
        Linkedlist l1 = new Linkedlist();
        l1.addAtTail(10); l1.display();
        l1.addAtTail(20); l1.display();
        l1.addAtTail(30); l1.display();
        l1.addAtTail(40); l1.display();
        l1.addAtTail(50); l1.display();
        l1.addAtHead(89); l1.display();
        l1.deleteAtHead(); l1.display();
        l1.deleteAtTail(); l1.display();
        System.out.println(l1.search(89));
        System.out.println(get(l1.Head,2));
        l1.insert(233,3); l1.display();
        System.out.println("Size = " + l1.size);
        l1.delete(4); l1.display();
        System.out.println("Size = " + l1.size);
    }

    private static int get(Node Head, int idx){
        Node temp = Head;
        for(int i = 0; i < idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }
}