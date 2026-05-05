// Title: Valid Digit Number
// URL: https://leetcode.com/problems/valid-digit-number/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean validDigit(int n, int x) {
        String s=Integer.toString(n);
        char res=(char)(x+'0');
        if(s.charAt(0)==res){
            return false;
        }
        for(int i=1;i<s.length();i++) {
            if (s.charAt(i)==res) {
                return true;
            }
        }
        return false;
    }
}