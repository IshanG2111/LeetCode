// Title: Single Number
// URL: https://leetcode.com/problems/single-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for (int i = 0; i < nums.length; i++) {
            unique^=nums[i];
        }
        return unique;
    }
}