package Stack;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class MyStack{
    Node head;
    int len;
    int peek() throws Exception{
        if(len ==0){
            throw new Exception("stack is empty");
        }
        return head.val;}
    int pop() throws Exception{
        if(len ==0){
            throw new Exception("stack is empty");}
        int x=head.val;
        head = head.next;
        len--;
        return x;}

    void push(int ele){//add at head
        Node temp= new Node(ele);
        if(len ==0){head= temp;len++;}
        else{
            temp.next = head;
            head = temp;
            len++;}
    }
    int size(){
        return len;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }System.out.println();
    }
}
public class LLImplementationOfStack {
    public static void main(String[] args) throws Exception {
        MyStack st = new MyStack();
        st.pop();
        st.push(10);
        st.push(20);st.push(30);st.push(80);
        st.display();

        st.pop();
        st.display();
    }
}
