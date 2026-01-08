class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[][] dp=new int[n1+1][n2+1];
        for (int[] row:dp) {
            Arrays.fill(row,Integer.MIN_VALUE);
        }
        for (int i=1;i<=n1;i++) {
            for (int j=1;j<=n2;j++){
                int cur=nums1[i-1]*nums2[j-1];
                dp[i][j] = Math.max(cur,Math.max(dp[i - 1][j], dp[i][j - 1]));
                if(dp[i-1][j-1]!=Integer.MIN_VALUE){
                    dp[i][j]=Math.max(dp[i][j],dp[i-1][j-1]+cur);
                }
            }
        }
        return dp[n1][n2];
    }
}
