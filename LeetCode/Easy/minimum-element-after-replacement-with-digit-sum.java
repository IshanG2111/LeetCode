// Title: Minimum Element After Replacement With Digit Sum
// URL: https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/
// Difficulty: Easy
// Language: java

class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int j=nums[i];
            while(j>0){
                sum+=j%10;
                j/=10;
            }
            min=Math.min(min,sum);
        }
        return min;
    }
}