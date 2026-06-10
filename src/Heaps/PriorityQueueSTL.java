package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Arrays;

public class PriorityQueueSTL {


    public static int minCost(@org.jetbrains.annotations.NotNull int[] stones) {
        int sum =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<stones.length ;i++){
            pq.add(stones[i]);
        }while(pq.size()>1){
            int a = pq.remove();
            int b = pq.remove();
            sum += (a+b);
            pq.add(a+b);
        }return sum;

    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length ;i++){
            pq.add(stones[i]);
        }while(pq.size()>1){
            pq.add(pq.remove()-pq.remove());
        }return pq.remove();

    }

    public static void main(String []args){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);pq.add(-23);pq.add(89);
        System.out.println(pq.peek());
        pq.add(35);
        System.out.println(pq.remove());
        System.out.println(pq.peek());
        System.out.println(pq.size());
        pq.add(2);pq.add(4);pq.add(-2);
        pq.add(0);
        for(int ele :pq){
            System.out.print(ele+" ");
        }
            System.out.println();
        kthLargestNumber KL= new kthLargestNumber();
        int ans =KL.findKthLargest(new int[]{3,2,1,5,6,4},2);
        System.out.println(ans);
        int[] stones = {1,5,3,7,8,3,5,0,2};
        System.out.println(lastStoneWeight(stones));

        System.out.println("mincost:");
        int[] arr={4,3,2,6};
        System.out.println(minCost(arr));

        System.out.println("KclosestPointsFromOrigin;");
        kClosestPointsFromOrigin KCPFO = new kClosestPointsFromOrigin();
        int[][] points ={{3,3},{5,-1},{-2,4}};
        for (int[] row : KCPFO.kClosest(points,2)) {
            System.out.println("[" + row[0] + " " + row[1]+ "]");}

            System.out.println("kclosestElements:");
            System.out.println(kClosestElements.findClosestElements(arr,2,9));

            System.out.println("frequency of elements:");
        System.out.println(Arrays.toString(
                maxFreqElements.topKFrequent(
                        new int[]{1, 2, 1, 2, 1, 2, 3, 1, 2, 3, 2}, 2)
        ));

    }
}
