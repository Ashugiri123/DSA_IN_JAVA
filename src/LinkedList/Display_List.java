package LinkedList;

import java.util.Scanner;
import java.net.SocketOption;

public class Display_List{
    public static void DisplayList(Node Head){
//        System.out.println(Head.val+" ");
//        System.out.println(Head.next.val+" ");
//        System.out.println(Head.next.next.val+" ");
//        System.out.println(Head.next.next.next.val+" ");
//        System.out.println(Head.next.next.next.next.val+" ");

//        by using loops
        Node temp= Head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp =temp.next;
        }System.out.println();
    }
    public static void Displayrec(Node Head){
        if(Head == null)return;
        System.out.print(Head.val+" ");
//        if you want to reverse linked list so interchange above and below line
        Displayrec(Head.next);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        Node Head= new Node(10);
        Node b= new Node(20);
        Node c= new Node(30);
        Node d= new Node(40);
        Node e= new Node(sc.nextInt());

        Head.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

//     by using method
        DisplayList(Head);
//        by recursive approach
        Displayrec(Head);
        System.out.print(get(Head,2));
    }
    private static int get(Node head,int idx){
        Node temp=head;
        for(int i=0;i<idx;i++) {
            temp = temp.next;
//        we are using  temp in place of head as a reffrence variable for getting head value at any time
        }return temp.val;
    }
}

