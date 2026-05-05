// Title: Find Pivot Index
// URL: https://leetcode.com/problems/find-pivot-index/
// Difficulty: Easy
// Language: java

class Solution {
    public int pivotIndex(int[] nums) {
        int r = -1;
        int[] sumLeft = new int[nums.length];
        int[] sumright = {};
        int iniL = 0;
        for (int i = 0; i < nums.length; i++) {
            sumLeft[i] = iniL;
            iniL += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int rsum = iniL - sumLeft[i] - nums[i];
            if(rsum==sumLeft[i]){
                return i;
            }
        }
        return r;
    }
}