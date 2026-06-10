package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

class Triplate implements Comparable<Triplate>{
    int Dist;
    int x, y;
    Triplate(int Dist , int x,int y){
        this.Dist = Dist;
        this.x= x;
        this.y=y;
    }
    public int compareTo(Triplate t){
        return (this.Dist - t.Dist);
    }

}

public class kClosestPointsFromOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplate> pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int[] point :points){
            int x = point[0];
            int y = point[1];
            int Dist = x*x + y*y;
            pq.add(new Triplate(Dist , x , y));
            if(pq.size()> k )pq.remove();
        }
        int[][] ans = new int[k][2];

        for(int i =0;i<k;i++){
            Triplate top = pq.remove();
            ans[i][0]=top.x;
            ans[i][1]=top.y;
        }return ans;
    }
}

