package Heaps;

class Heap {
    int[] arr;
    int idx;

    Heap(int size) {
        arr = new int[size + 1];
        idx = 1;
    }

    boolean isEmpty() {
        return idx == 1;
    }

    int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }
        return arr[1];
    }

    void add(int ele) {
        arr[idx] = ele;

        int child = idx;
        int parent = child / 2;

        while (child > 1 && arr[child] < arr[parent]) {
            int temp = arr[child];
            arr[child] = arr[parent];
            arr[parent] = temp;

            child = parent;
            parent = child / 2;
        }

        idx++;
    }

    int remove() {
        if (isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }

        int ans = arr[1];

        arr[1] = arr[idx - 1];
        idx--;

        int root = 1;

        while (true) {
            int left = 2 * root;
            int right = 2 * root + 1;
            int smallest = root;

            if (left < idx && arr[left] < arr[smallest]) {
                smallest = left;
            }

            if (right < idx && arr[right] < arr[smallest]) {
                smallest = right;
            }

            if (smallest == root) {
                break;
            }

            int temp = arr[root];
            arr[root] = arr[smallest];
            arr[smallest] = temp;

            root = smallest;
        }

        return ans;
    }

    void display() {
        for (int i = 1; i < idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class MinHeapImplementation {
    public static void main(String[] args) {
        Heap h = new Heap(20);

        h.add(10);
        h.add(5);
        h.add(20);
        h.add(2);
        h.add(15);

        h.display();

        System.out.println("Peek: " + h.peek());

        System.out.println("Removed: " + h.remove());
        h.display();

        System.out.println("Removed: " + h.remove());
        h.display();
    }
}