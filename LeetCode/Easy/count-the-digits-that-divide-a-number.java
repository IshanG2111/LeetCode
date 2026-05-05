// Title: Count the Digits That Divide a Number
// URL: https://leetcode.com/problems/count-the-digits-that-divide-a-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int countDigits(int num) {
        int ori=num;
        int count=0;
        int d=0;
        while(num>0){
            d=num%10;
            if(d!=0 && ori%d==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}