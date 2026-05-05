// Title: Add Digits
// URL: https://leetcode.com/problems/add-digits/
// Difficulty: Easy
// Language: java

class Solution {
    public int addDigits(int num) {
        int sum=0;
        if (num<10){
            return num;
        }
        while(num>0) {
            int t=num%10;
            sum+=t;
            num/=10;
        }
        return addDigits(sum);
    }
}