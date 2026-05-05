// Title: Majority Element
// URL: https://leetcode.com/problems/majority-element/
// Difficulty: Easy
// Language: java

class Solution {
    public int majorityElement(int[] nums) {
        int l=nums.length/2;
        int temp=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==temp){
                count++;
            }
            else{
                count--;
            }
            if(count<=0){
                temp=nums[i];
                count=1;
            }
        }
        return temp;
    }
}