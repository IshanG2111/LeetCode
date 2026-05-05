// Title: Check if Binary String Has at Most One Segment of Ones
// URL: https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean checkOnesSegment(String s) {
        if(s.length()==1 && s.charAt(0)=='1' ){
            return true;
        }
        for(int i=0;i<s.length()-1;i++){
             if (s.charAt(i) == '0' && s.charAt(i + 1) == '1') {
                return false; 
            }
        }
        return true;
    }
}