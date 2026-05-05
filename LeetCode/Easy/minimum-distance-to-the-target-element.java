// Title: Minimum Distance to the Target Element
// URL: https://leetcode.com/problems/minimum-distance-to-the-target-element/
// Difficulty: Easy
// Language: java

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int val=0;
        int result=1;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         val=i;
        //         result=Math.min(result,(val-start));
        //     }
        // }
        int rr=nums.length;
        int lr=nums.length;
        for(int i=start;i>=0;i--){
            if(nums[i]==target){
                lr=start-i;
                break;
            }
        }
        for(int i=start;i<nums.length;i++){
            if(nums[i]==target){
                rr=i-start;
                break;
            }
        }
        return Math.abs(Math.min(rr,lr));
    }
}