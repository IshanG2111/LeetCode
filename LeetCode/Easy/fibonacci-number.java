// Title: Fibonacci Number
// URL: https://leetcode.com/problems/fibonacci-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-2)+fib(n-1);
    }
}