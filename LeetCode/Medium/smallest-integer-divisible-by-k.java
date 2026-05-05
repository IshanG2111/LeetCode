// Title: Smallest Integer Divisible by K
// URL: https://leetcode.com/problems/smallest-integer-divisible-by-k/
// Difficulty: Medium
// Language: java

class Solution {
    public int smallestRepunitDivByK(int k) {
        int rem=1;
        int len=1;
        int e=k%10;
        if(e%2==0||e==5){
            return -1;
        }
        if(k==1){
            return 1;
        }
        while(true){
            rem=(rem*10+1)%k;
            len++;
            if(rem==0){
                return len;
            }
        }
    }
}