// Title: Digit Frequency Score
// URL: https://leetcode.com/problems/digit-frequency-score/
// Difficulty: Easy
// Language: java

class Solution {
    public int digitFrequencyScore(int n) {
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
}