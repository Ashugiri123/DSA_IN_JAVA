package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    PriorityQueue<Integer> Min =new PriorityQueue<>();
    PriorityQueue<Integer>  Max = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
    }

    public void addNum(int num) {
        if(Max.size()==0)Max.add(num);
        else{
            if(num<Max.peek())Max.add(num);
            else Min.add(num);
        }
        if(Max.size()==Min.size()+2){Min.add(Max.remove());}
        if(Min.size()==Max.size()+2){Max.add(Min.remove());}
    }

    public double findMedian() {
        if(Max.size()==Min.size()+1)return Max.peek();
        else{
            if(Min.size()==Max.size()+1)return Min.peek();
            else return (Max.peek()+Min.peek())/2.0;
        }

    }
}
