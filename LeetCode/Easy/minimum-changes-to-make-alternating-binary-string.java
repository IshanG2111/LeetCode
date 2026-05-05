// Title: Minimum Changes To Make Alternating Binary String
// URL: https://leetcode.com/problems/minimum-changes-to-make-alternating-binary-string/
// Difficulty: Easy
// Language: java

class Solution {
    public int minOperations(String s) {
        int res=0;
        int n=s.length();
        for(int i=0;i<s.length();i++){
             if (i % 2 == 0) {
                if (s.charAt(i) != '0'){
                    res++;
                }
            } else {
                if (s.charAt(i) != '1') res++;
            }
        }
        return Math.min(res, n - res);
    }
}