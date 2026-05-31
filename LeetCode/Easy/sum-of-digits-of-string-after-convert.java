// Title: Sum of Digits of String After Convert
// URL: https://leetcode.com/problems/sum-of-digits-of-string-after-convert/
// Difficulty: Easy
// Language: java

class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for (char ch:s.toCharArray()){
            int val=ch-'a'+1;
            sum+=val/10+val%10;
        }
        while(--k>0){
            int temp=0;
            while(sum>0){
                temp+=sum%10;
                sum/=10;
            }
            sum=temp;
        }
        return sum;
    }
}