package Stack;

import java.util.*;

public class StockSpan {

        private static int[] stackspan(int[] arr) {

            Stack<Integer> st = new Stack<>();
            int[] res = new int[arr.length];

            for (int i = arr.length - 1; i >= 0; i--) {
                while (!st.isEmpty() && st.peek() <= arr[i]) {
                    st.pop();
                }
                res[i] = st.isEmpty() ? -1 : st.peek();
                st.push(arr[i]);
            }
            return res;
        }


        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int[] arr=new int[7];
            for(int i=0 ; i<7 ; i++) {
                arr[i] = sc.nextInt();
            } System.out.println(Arrays.toString(stackspan(arr)));
            sc.close();
        }
    }
