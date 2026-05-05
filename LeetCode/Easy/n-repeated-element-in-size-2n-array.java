// Title: N-Repeated Element in Size 2N Array
// URL: https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int repeatedNTimes(int[] nums) {
        int num=nums.length/2;
        Arrays.sort(nums);
        int it=nums[0];
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==it){
                count++;
                if(count==num-1){
                    return nums[i];
                }
            }
            else{
                it=nums[i+1];
                count=0;
            }
        }
        return 0;
    }
}