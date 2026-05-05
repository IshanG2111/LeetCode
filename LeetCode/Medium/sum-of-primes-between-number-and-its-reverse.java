// Title: Sum of Primes Between Number and Its Reverse
// URL: https://leetcode.com/problems/sum-of-primes-between-number-and-its-reverse/
// Difficulty: Medium
// Language: java

class Solution {
    public int sumOfPrimesInRange(int n) {
        int r=0;
        int temp=n;
        while(temp>0){
            r=(r*10)+(temp%10);
            temp/=10;
        }
        int l=Math.min(n,r);
        int h=Math.max(n,r);
        int ans=0;
        for(int i=l;i<=h;i++){
            if(i<2){
                continue;
            }
            boolean ok=true;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    ok=false;
                }
            }
            if(ok==true){
                ans+=i;
            }
        }
            return ans;
    }
}