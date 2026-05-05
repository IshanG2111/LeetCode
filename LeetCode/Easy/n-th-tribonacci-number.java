// Title: N-th Tribonacci Number
// URL: https://leetcode.com/problems/n-th-tribonacci-number/
// Difficulty: Easy
// Language: java

class Solution {
    public int tribonacci(int n) {
        int[] f=new int[38];
        f[0]=0;
        f[1]=f[2]=1;
        if(n==0)
        return 0;
        if(n==1||n==2)
        return 1;
        for(int i=3;i<=n;i++){
            f[i] = f[i-3] + f[i-2] +f[i-1];
        }
        return f[n];
    }
}