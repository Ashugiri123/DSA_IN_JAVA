package Queue;

public class LLImplementationOfQueue {

        public static void main(String[] args){
            Queue_By_LL q= new Queue_By_LL();
            q.add(10);q.add(23);q.add(90);q.add(32);
            q.display();
            System.out.println(q.remove());
            q.display();
        }
    }
