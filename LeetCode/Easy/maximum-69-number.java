// Title: Maximum 69 Number
// URL: https://leetcode.com/problems/maximum-69-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int maximum69Number (int num) {
        String str=Integer.toString(num);
        char[] digits = str.toCharArray(); 
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == '6') {
                digits[i] = '9'; 
                break; 
            }
        }
        String result = new String(digits); 
        return Integer.parseInt(result); 
    }
}