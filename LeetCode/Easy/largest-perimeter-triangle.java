// Title: Largest Perimeter Triangle
// URL: https://leetcode.com/problems/largest-perimeter-triangle/
// Difficulty: Easy
// Language: java

class Solution {
    public int largestPerimeter(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        if(nums.length<3){
            return 0;
        }
        if(nums.length==3){
            if(nums[0]+nums[1]>nums[2]){
            return nums[0]+nums[1]+nums[2];
            }
            return 0;
        }
        for(int i=nums.length-1;i>=2;i--){
            if(nums[i]<nums[i-1]+nums[i-2]){
            return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
}