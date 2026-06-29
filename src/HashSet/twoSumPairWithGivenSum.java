package HashSet;

import java.util.HashSet;

public class twoSumPairWithGivenSum {
    boolean twoSum(int arr[], int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int ans = target - arr[i];
            if(set.contains(ans))return true;
            set.add(arr[i]);
        }
        return false;
    }
}
