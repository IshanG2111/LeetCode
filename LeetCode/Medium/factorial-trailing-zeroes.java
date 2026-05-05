// Title: Factorial Trailing Zeroes
// URL: https://leetcode.com/problems/factorial-trailing-zeroes/
// Difficulty: Medium
// Language: java

class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        int r=5;
        while(n>=5){
            n/=5;
            count+=n;
        }
        return count;
    }
}