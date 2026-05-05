// Title: Valid Perfect Square
// URL: https://leetcode.com/problems/valid-perfect-square/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;//since 1 is perfect square 1*1==1
        }
    for( long i=1;i<num;i++){
        if(i*i==num)
            return true;
        if(i*i>num)
            return false;
    }
    return false;
}
}