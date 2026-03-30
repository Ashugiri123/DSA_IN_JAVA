package Queue;

class CircularQueue {
    int[] arr;
    int size;
    int f;
    int r;

    CircularQueue(int val) {
        arr = new int[val];
    }

    void add(int val) {
        if (size == arr.length) {
            System.out.println("Overrflow!!");
            return;
        }
        arr[r++] = val;
        size++;
        if (r == arr.length) {
            r = 0;
        }
        System.out.println();
        return;
    }

    int remove() {
        if (size == 0) {
            System.out.println("underflow!!");
            return -1;
        }
        int place = arr[f++];
        size--;
        if (f == arr.length) f = 0;
        System.out.println();
        return place;
    }
    int peek(){
        if(size==0){System.out.println("Error!!");return -1;}
        return arr[f];
    }
    void display(){
        if(size==0){System.out.println("Empty!");return;}
        if(f>r){
            for(int i = f ;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }for(int i = 0;i<r;i++){
                System.out.print(arr[i]+" ");
            }return ;
        }
        for(int i =f;i<r;i++){
            System.out.print(arr[i]+" ");
        }return;
    }}
public class Myarray {
    public static void main(String[] args){
        CircularQueue q= new CircularQueue(4);
        q.add(3);q.add(4);q.add(0);
        q.display();
        System.out.print(q.remove());
        q.remove();
        q.remove();
        q.display();
    }}
