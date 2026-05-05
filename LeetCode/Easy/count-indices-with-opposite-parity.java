// Title: Count Indices With Opposite Parity
// URL: https://leetcode.com/problems/count-indices-with-opposite-parity/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int even=0;
        int odd=0;
        for(int i=n-1;i>=0;i--){
            if((nums[i]&1)==0){
                res[i]=odd;
            }
            else{
                res[i]=even;
            }
            if((nums[i]&1)==0){
                even++;
            }
            else{
                odd++;
            }
        }
        return res;
    }
}