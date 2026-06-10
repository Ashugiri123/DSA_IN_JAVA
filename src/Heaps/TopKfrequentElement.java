package Heaps;
import java.util.*;
class Doublate implements Comparable<Doublate>{
    int freq;
    int val;
    Doublate(int freq,int val){
        this.freq = freq;
        this.val = val;
    }
    public int compareTo(Doublate d){
        if(this.freq == d.freq){
            return this.freq - d.freq;
        }
        return (this.freq - d.freq);
    }
}
public class TopKfrequentElement {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele: nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<Doublate> pq = new PriorityQueue<>();
        for(int ele : map.keySet()){

            int freq = map.get(ele);

            pq.add(new Doublate(freq ,ele));

            if(pq.size()>k)pq.remove();

        }
        int[] ans =new int[k];


        for(int i =0;i<k;i++){
            Doublate top=pq.remove();
            ans[i]=(top.val);
        }return (ans);
    }
}
