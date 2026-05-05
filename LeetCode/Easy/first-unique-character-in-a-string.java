// Title: First Unique Character in a String
// URL: https://leetcode.com/problems/first-unique-character-in-a-string/
// Difficulty: Easy
// Language: java

class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                return i;
            }
        }
        return -1;
    }
}