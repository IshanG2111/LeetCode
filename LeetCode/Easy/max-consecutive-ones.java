// Title: Max Consecutive Ones
// URL: https://leetcode.com/problems/max-consecutive-ones/
// Difficulty: Easy
// Language: java

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count=0;
        int curr_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curr_count++;
                max_count=Math.max(max_count,curr_count);
            }
            else{
                curr_count=0;
            }
        }
        return max_count;
    }
}