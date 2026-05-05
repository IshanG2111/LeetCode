// Title: Partitioning Into Minimum Number Of Deci-Binary Numbers
// URL: https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
// Difficulty: Medium
// Language: java

class Solution {
    public int minPartitions(String n) {
        int ans=0;
        for(char c:n.toCharArray()){
            ans=Math.max(ans,Integer.parseInt(Character.toString(c)));
        }
        return ans;
    }
}