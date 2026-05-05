// Title: Count Primes
// URL: https://leetcode.com/problems/count-primes/
// Difficulty: Medium
// Language: java

class Solution {
    public int countPrimes(int n) {
        int count=0;
        boolean []isPrime=new boolean[n];
        for(int k=0;k<n;k++){
            isPrime[k]=true;
        }
        for(int i=2;i*i<n;i++){
            if(isPrime[i]==true){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j]=false;
                }
            }
        }
        for(int l=2;l<n;l++){
            if(isPrime[l]==true){
                count++;
            }
        }  
        return count;
    }
}