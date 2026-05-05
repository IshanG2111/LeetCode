// Title: Single Element in a Sorted Array
// URL: https://leetcode.com/problems/single-element-in-a-sorted-array/
// Difficulty: Medium
// Language: java

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int result=0;
        for(int i=0;i<nums.length;i++){
            result=result^nums[i];
        }
        return result;
    }
}