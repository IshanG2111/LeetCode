// Title: Largest Odd Number in String
// URL: https://leetcode.com/problems/largest-odd-number-in-string/
// Difficulty: Easy
// Language: java

class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            int digit=num.charAt(i)-'0';
            if(digit%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}