// Title: Happy Number
// URL: https://leetcode.com/problems/happy-number/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isHappy(int n) {
        int pro = 0;

        if (n == 1) {
            return true;
        }
        if (n == 4) {
            return false;
        }

        while (n > 0) {
            int digit = n % 10;
            pro += digit * digit;
            n /= 10;
        }

        return isHappy(pro);
    }
}
