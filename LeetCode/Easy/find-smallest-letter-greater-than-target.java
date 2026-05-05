// Title: Find Smallest Letter Greater Than Target
// URL: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Difficulty: Easy
// Language: java

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int t=(int)target;
        int mint=0;
        for(int i=0;i<letters.length;i++){
            mint = (int) letters[i] - t;
            if (mint > 0) {
                return letters[i];
            }
        }
        return letters[0];
    }
}