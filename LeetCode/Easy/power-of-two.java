// Title: Power of Two
// URL: https://leetcode.com/problems/power-of-two/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isPowerOfTwo(int n) {
        int original=n;
        //n==2^x
        if (n < 0) {
            return false;
        }
        double base=2;
        double count= Math.log(n) / Math.log(base);
        int m = (int) Math.round(count);
        if(Math.pow(2,m)==original){
            return true;
        }
        return false;

    }
}