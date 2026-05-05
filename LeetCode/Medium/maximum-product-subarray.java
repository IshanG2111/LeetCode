// Title: Maximum Product Subarray
// URL: https://leetcode.com/problems/maximum-product-subarray/
// Difficulty: Medium
// Language: java

class Solution {
    public int maxProduct(int[] nums) {
        int sum=nums[0];
        int min=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int temp=sum;
            sum=Math.max(nums[i],Math.max(sum*nums[i],min*nums[i]));
            min=Math.min(nums[i],Math.min(temp*nums[i],min*nums[i]));
            result=Math.max(result,sum);
        }
        return result;
    }
}