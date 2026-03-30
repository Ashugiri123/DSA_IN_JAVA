package Queue;

import java.util.*;

public class FirstNegativeInEveryWindowOfSizeK {


    public static List<Integer> firstNegInt(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();

        int n = arr.length;
        if (k > n || k <= 0) return result;

        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) dq.addLast(i);
        }

        for (int i = k; i < n; i++) {
            result.add(dq.isEmpty() ? 0 : arr[dq.peekFirst()]);

            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            if (arr[i] < 0) dq.addLast(i);
        }

        result.add(dq.isEmpty() ? 0 : arr[dq.peekFirst()]);

        return result;
    }

        public static void main(String[] args) {
            int[] arr = { -8, 2, 3, -6, 10 };
            int k = 2;

            System.out.println(firstNegInt(arr, k));
        }
    }
