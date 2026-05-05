// Title: Longest Common Prefix
// URL: https://leetcode.com/problems/longest-common-prefix/
// Difficulty: Easy
// Language: java

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f=strs[0];
        String l=strs[strs.length-1];
        int minlen=Math.min(f.length(),l.length());
        int i=0;
        while(i<minlen && f.charAt(i)==l.charAt(i)){
            i++;
        }
        return f.substring(0,i);
    }
}