// Title: Construct the Minimum Bitwise Array I
// URL: https://leetcode.com/problems/construct-the-minimum-bitwise-array-i/
// Difficulty: Easy
// Language: java

import java.util.List;

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n=nums.size();
        int[] ans=new int[n];
        for (int i=0;i<n;i++) {
            int p=nums.get(i);
            if(p==2){
                ans[i]=-1;
            } 
            else{
                for(int bit = 1; bit < 31; bit++) {
                    if(((p >> bit) & 1) == 0){
                        ans[i] = p^(1 << (bit - 1));
                        break;
                    }
                }
            }
        }
        return ans;
    }
}