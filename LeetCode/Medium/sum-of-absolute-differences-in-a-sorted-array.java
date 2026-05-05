// Title: Sum of Absolute Differences in a Sorted Array
// URL: https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/
// Difficulty: Medium
// Language: java

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
       int total=0;
       int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int rightsum=total-leftsum-nums[i];
            int left=nums[i]*i-leftsum;
            int right=rightsum-nums[i]*(nums.length-i-1);
            arr[i]=left+right;
            leftsum+=nums[i];
        }
        return arr;
    }
}