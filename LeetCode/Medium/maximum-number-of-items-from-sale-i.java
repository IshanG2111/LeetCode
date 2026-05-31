// Title: Maximum Number of Items From Sale I
// URL: https://leetcode.com/problems/maximum-number-of-items-from-sale-i/
// Difficulty: Medium
// Language: java

class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        int[] b=new int[n];
        int c=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            c=Math.min(c,items[i][1]);
            for(int j=0;j<n;j++){
                if(i!=j && items[j][0]%items[i][0]==0){
                    b[i]++;
                }
            }
        }
        long[] dp=new long[budget+1];
        for(int m=0;m<=budget;m++){
            dp[m]=Long.MIN_VALUE/4;
        }
        dp[0]=0;
        for(int i=0;i<n;i++){
            int p=items[i][1];
            long g=b[i]+1;
            for(int j=budget;j>=p;j--){
                dp[j]=Math.max(dp[j],dp[j-p]+g);
            }
        }
        long a=budget/c;
        for(int i=0;i<=budget;i++){
            if(dp[i]<=Long.MIN_VALUE/8){
            continue;
            }
            a=Math.max(a,dp[i]+(budget-i)/c);
        }
        return (int)a;
    }
}