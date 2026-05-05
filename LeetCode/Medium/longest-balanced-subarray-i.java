// Title: Longest Balanced Subarray I
// URL: https://leetcode.com/problems/longest-balanced-subarray-i/
// Difficulty: Medium
// Language: java

class Solution {
    public int longestBalanced(int[] nums) {
        int max=0;
        Map<Integer, Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            Set<Integer> even=new HashSet<>();
            Set<Integer> odd=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0){
                    even.add(nums[j]);
                }
                else{
                    odd.add(nums[j]);   
                }
                if(even.size()==odd.size()){
                   max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}