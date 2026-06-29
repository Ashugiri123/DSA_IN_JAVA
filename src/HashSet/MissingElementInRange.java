package HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MissingElementInRange {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int ele : nums){
            set.add(ele);
        }
        int min = Collections.min(set);
        int max = Collections.max(set);
        for(int i=min; i<max;i++){
            if(set.contains(i))continue;

            arr.add(i);
        }
        return arr;
    }
}
