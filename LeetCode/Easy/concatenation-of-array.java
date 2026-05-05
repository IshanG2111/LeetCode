// Title: Concatenation of Array
// URL: https://leetcode.com/problems/concatenation-of-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] getConcatenation(int[] nums) {
        int []nums2=new int[nums.length];
        int [] re=new int[nums.length*2];
        System.arraycopy(nums, 0, re, 0, nums.length);        
        System.arraycopy(nums, 0, re, nums.length, nums.length); 
        return re;
    }
}