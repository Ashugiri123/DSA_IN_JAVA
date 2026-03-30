package Queue;


    class Node{
        int val;Node next;
        Node(int val){
            this.val=val;
        }
    }

    public class Queue_By_LL {
        Node head;
        Node tail;
        int size;
        int peek(){
            if(size==0){System.out.print("Empty!");return -1;}
            return head.val;
        }
        void add(int val){
            Node temp = new Node(val);
            if(tail == null)head = tail = temp;
            else{
                tail.next = temp;
                tail = temp;}
            size++;
        }
        int remove(){
            if(head==null){System.out.print("Empty!");return -1;}
            Node temp=head;
            head=head.next;
            size--;

            return temp.val;
        }
        void display(){
            Node temp = head;
            while(temp!= null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }System.out.println();
        }
    }