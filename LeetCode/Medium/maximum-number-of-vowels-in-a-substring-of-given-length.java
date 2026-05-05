// Title: Maximum Number of Vowels in a Substring of Given Length
// URL: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
// Difficulty: Medium
// Language: java

class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if ("aeiou".indexOf(s.charAt(i)) != -1){
                count++;
            }
            if (i >= k && "aeiou".indexOf(s.charAt(i - k)) != -1){
                count--;
            }
            max = Math.max(max, count);
            if (count==k){
                return k;
            }
        }
        return max;
    }
}