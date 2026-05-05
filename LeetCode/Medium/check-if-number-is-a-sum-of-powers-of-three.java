// Title: Check if Number is a Sum of Powers of Three
// URL: https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/
// Difficulty: Medium
// Language: java

class Solution {
    public boolean checkPowersOfThree(int n) {
        while(n>1){
            if(n%3==2){
                return false;
            }
            n/=3;
        }
        return true;
    }
}