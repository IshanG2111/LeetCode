// Title: Running Sum of 1d Array
// URL: https://leetcode.com/problems/running-sum-of-1d-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] runningSum(int[] nums) {
        int running_sum=0;
        int []temp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            running_sum+=nums[i];
            temp[i]=running_sum;
        }
        return temp;
    }
}