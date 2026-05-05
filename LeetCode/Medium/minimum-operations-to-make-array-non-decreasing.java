// Title: Minimum Operations to Make Array Non Decreasing
// URL: https://leetcode.com/problems/minimum-operations-to-make-array-non-decreasing/
// Difficulty: Medium
// Language: java

class Solution {
    public long minOperations(int[] nums) {
        long totalCost=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                totalCost+=(nums[i-1]-nums[i]);
            }
        }
        return totalCost;
    }
}