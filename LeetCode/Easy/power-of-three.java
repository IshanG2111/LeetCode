// Title: Power of Three
// URL: https://leetcode.com/problems/power-of-three/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        while(n%3==0){
            n/=3;
        }
        return n==1;
    }
}