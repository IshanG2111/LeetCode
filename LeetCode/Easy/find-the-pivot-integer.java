// Title: Find the Pivot Integer
// URL: https://leetcode.com/problems/find-the-pivot-integer/
// Difficulty: Easy
// Language: java

class Solution {
    public int pivotInteger(int n) {
       for(int i=1;i<=n;i++){
            if((1+i) * i == (i + n) * (n - i + 1)){
                return i;
            }
       } 
       return -1;
    }
}