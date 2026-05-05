// Title: Minimum Absolute Difference Between Two Values
// URL: https://leetcode.com/problems/minimum-absolute-difference-between-two-values/
// Difficulty: Easy
// Language: java

class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int last=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                last=i;
            }
            else if(nums[i]==2&&last !=-1){
                min=Math.min(min,i-last);
            }
        }
        last=-1;
        for(int j=n-1;j>=0;j--){
            if(nums[j]==1){
                last=j;
            }
            else if(nums[j]==2 && last!=-1){
                min=Math.min(min,last-j);
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}