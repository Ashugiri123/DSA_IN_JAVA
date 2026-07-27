package Contests;

import java.util.Arrays;

public class GCD {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length - 1];
        return calculateGCD(smallest, largest);
    }

    public int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}
