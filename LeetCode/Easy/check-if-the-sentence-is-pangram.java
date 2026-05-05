// Title: Check if the Sentence Is Pangram
// URL: https://leetcode.com/problems/check-if-the-sentence-is-pangram/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()< 26){
            return false;
        }
        boolean[] seen = new boolean[26];
        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }
        for (boolean letter : seen) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }
}