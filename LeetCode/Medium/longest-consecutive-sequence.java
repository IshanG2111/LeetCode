// Title: Longest Consecutive Sequence
// URL: https://leetcode.com/problems/longest-consecutive-sequence/
// Difficulty: Medium
// Language: java

class Solution {
    public int longestConsecutive(int[] nums) {

        int longest=0;
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        for(int n: set){
            if (set.contains(n - 1)==false) {
                int curr = n;
                int streak = 1;

                while (set.contains(curr + 1)) {
                    curr++;
                    streak++;
                }

                longest = Math.max(longest, streak);
        }
        }
        return longest;



        // if(nums.length==0){
        //     return 0;
        // }
        // Arrays.sort(nums);
        // int count=1;
        // int longest=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]+1){
        //         count+=1;
        //         longest=Math.max(longest,count);
        //     }
        //     else{
        //         count=1;
        //     }
        // }
        // return longest;
    }
}