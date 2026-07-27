package HashMap;

import java.util.HashMap;

public class KdiffPairsinanArray {
    public int findPairs(int[] arr, int k) {
        int n=arr.length-1;
        HashMap<Integer,Integer> MapA = new HashMap<>();
        for(int ele : arr){

            if(MapA.containsKey(ele)){
                int freq = MapA.get(ele);
                MapA.put(ele,freq+1);
            }
            else{
                MapA.put(ele,1);
            }
        }

        int pairs = 0;
        for (int ele : MapA.keySet()) {
            if (k == 0) {
                if (MapA.get(ele) > 1) {
                    pairs++;
                }
            } else {
                if (MapA.containsKey(ele + k)) {
                    pairs++;
                }
            }
        }
        return pairs;

    }
}
