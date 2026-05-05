// Title: Count Negative Numbers in a Sorted Matrix
// URL: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
// Difficulty: Easy
// Language: python3

class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        m, n = len(grid), len(grid[0])
        count = 0
        row, col = m - 1, 0
        while row >= 0 and col < n:
            if grid[row][col] < 0:
                count += n - col 
                row -= 1         
            else:
                col += 1         
        return count
        