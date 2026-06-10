package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class ElePair implements Comparable<ElePair>{
    int diff;
    int val;
    ElePair(int diff, int val){
        this.diff = diff;
        this.val = val;
    }
    public int compareTo(ElePair d){
        if(this.diff == d.diff){
            return this.val - d.val;
        }
        return (this.diff-d.diff);
    }
}


public class kClosestElements  {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<ElePair> pq = new PriorityQueue<>(Collections.reverseOrder());
        int diff;
        for(int ele : arr){

            diff = Math.abs(ele-x);

            pq.add(new ElePair(diff,ele));

            if(pq.size()>k)pq.remove();

        }
        ArrayList<Integer> ans =new ArrayList<>();


        for(int i =0;i<k;i++){
            ElePair top=pq.remove();
            ans.add(top.val);
            Collections.sort(ans);
        }return (ans);
    }
}

