// Title: Minimum Number of Pushes to Type Word I
// URL: https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/
// Difficulty: Easy
// Language: java

class Solution {
    public int minimumPushes(String word) {
            int n=word.length();
            int push=0;
            for(int i=0;i<n;i++){
                push+=(i/8)+1;
            }
            return push;
    }
}