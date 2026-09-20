package Assignment2;

import java.util.Arrays;

public class Kth_Largest_Eelement_in_array {
     public int findKthLargest(int[] nums, int k) {
        // brute force
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n-k];
    }
}
