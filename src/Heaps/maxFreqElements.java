package Heaps;

import org.jetbrains.annotations.NotNull;

import java.util.*;

class Pair implements Comparable<Pair>{
    int freq;
    int val;
    Pair(int freq, int val){
        this.freq = freq;
        this.val = val;
    }
    public int compareTo(Pair d){
        if(this.freq == d.freq){
            return this.val - d.val;
        }
        return (this.freq - d.freq);
    }


}
public class maxFreqElements {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele: nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele : map.keySet()){

            int freq = map.get(ele);

            pq.add(new Pair(freq ,ele));

            if(pq.size()>k)pq.remove();

        }
        int[] ans =new int[k];


        for(int i =0;i<k;i++){
            Pair top=pq.remove();
            ans[i]=(top.val);
        }return (ans);
    }
}
