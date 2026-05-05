// Title: Check if All A's Appears Before All B's
// URL: https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean checkString(String s) {
        char[] str=s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
            if(str[i]=='b' && str[i+1]=='a'){
                return false;
            }
        }
        return true;
    }
}