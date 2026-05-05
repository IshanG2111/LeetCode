// Title: Rotate String
// URL: https://leetcode.com/problems/rotate-string/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String combined = s + s;
        return combined.contains(goal);
    }
}