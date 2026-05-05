// Title: Missing Number
// URL: https://leetcode.com/problems/missing-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        int highest=nums[l-1];
        int smallest=nums[0];
        int j=0;
        int []arr=new int[l+1];
        for(int i=smallest;i<highest+1;i++){
            arr[i]=i;
        }
        for(int i=0;i<l;i++){
            if(arr[i]!=nums[i]){
                return arr[i];
            }
        }
        return (smallest==0)?l:0;
    }
}