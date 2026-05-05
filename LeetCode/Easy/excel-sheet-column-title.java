// Title: Excel Sheet Column Title
// URL: https://leetcode.com/problems/excel-sheet-column-title/
// Difficulty: Easy
// Language: java

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            char ch=(char)('A'+rem);
            result.insert(0,ch);
            columnNumber/=26;
        }
        return result.toString();
    }
}