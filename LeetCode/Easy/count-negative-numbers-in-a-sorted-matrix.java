// Title: Count Negative Numbers in a Sorted Matrix
// URL: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
// Difficulty: Easy
// Language: java

class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int i = m - 1;
        int j = 0;
        int ans = 0;
        while (i >= 0 && j < n) {
            if (grid[i][j] >= 0) {
                j++;
            } else {
                ans += n - j;
                i--;
            }
        }
        return ans;
    }
}