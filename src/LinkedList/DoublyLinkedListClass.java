package LinkedList;

    class ListNode {
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int val){
            this.val = val;
        }
    }

    class DLL {
        ListNode head;
        ListNode tail;
        int size;

        void insertAtHead(int val){
            ListNode temp = new ListNode(val);
            if(head == null){
                head = tail = temp;
            }else{
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            size++;
        }

        void insertAtTail(int val){
            ListNode temp = new ListNode(val);
            if(head == null){
                head = tail = temp;
            }else{
                temp.prev = tail;
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void deleteAtHead(){
            if(size == 0){
                System.out.println("list is empty");
                return;
            }
            if(head == tail){
                head = tail = null;
            }else{
                head = head.next;
                head.prev = null;
            }
            size--;
        }

        void deleteAtTail(){
            if(size == 0){
                System.out.println("list is empty");
                return;
            }
            if(head == tail){
                head = tail = null;
            }else{
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }

        void display(){
            ListNode temp = head;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void displayreverse(){
            ListNode temp = tail;
            while(temp != null){
                System.out.print(temp.val + " ");
                temp = temp.prev;
            }
            System.out.println();
        }
    }

    public class DoublyLinkedListClass {
        public static void main(String[] args){
            DLL list = new DLL();
            list.insertAtHead(32);
            list.insertAtHead(76);
            list.insertAtTail(65);
            list.insertAtTail(56);
            list.display();

            list.deleteAtHead();
            list.deleteAtTail();
            list.display();

            list.insertAtHead(32);
            list.insertAtHead(76);
            list.insertAtTail(65);
            list.insertAtTail(56);
            list.displayreverse();
        }
    }
