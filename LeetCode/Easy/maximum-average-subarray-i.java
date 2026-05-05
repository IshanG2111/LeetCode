// Title: Maximum Average Subarray I
// URL: https://leetcode.com/problems/maximum-average-subarray-i/
// Difficulty: Easy
// Language: java

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max_sum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            max_sum = Math.max(max_sum, sum);
        }
        return max_sum/k;
    }
}