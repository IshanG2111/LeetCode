// Title: Valid Elements in an Array
// URL: https://leetcode.com/problems/valid-elements-in-an-array/
// Difficulty: Easy
// Language: java

class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        if(n==0){
            return res;
        }
        boolean[] isValid=new boolean[n];
        int l=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>l){
                isValid[i]=true;
                l=nums[i];
            }
        }
        int r=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(nums[i]>r){
                isValid[i]=true;
                r=nums[i];
            }
        }
        for(int i=0;i<n;i++){
            if(isValid[i]){
                res.add(nums[i]);
            }
        }
        return res;
    }
}