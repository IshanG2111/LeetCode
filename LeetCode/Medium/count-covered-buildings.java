// Title: Count Covered Buildings
// URL: https://leetcode.com/problems/count-covered-buildings/
// Difficulty: Medium
// Language: java

class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer, Integer> rowMin = new HashMap<>();
        Map<Integer, Integer> rowMax = new HashMap<>();
        Map<Integer, Integer> colMin = new HashMap<>();
        Map<Integer, Integer> colMax = new HashMap<>();

        for (int[] b : buildings) {
            int x = b[0];
            int y = b[1];
            rowMin.put(x, Math.min(rowMin.getOrDefault(x, Integer.MAX_VALUE), y));
            rowMax.put(x, Math.max(rowMax.getOrDefault(x, Integer.MIN_VALUE), y));
            colMin.put(y, Math.min(colMin.getOrDefault(y, Integer.MAX_VALUE), x));
            colMax.put(y, Math.max(colMax.getOrDefault(y, Integer.MIN_VALUE), x));
        }

        int covered = 0;

        for (int[] b : buildings) {
            int x = b[0];
            int y = b[1];

            boolean left  = y > rowMin.get(x); // smaller y 
            boolean right = y < rowMax.get(x); // larger y 
            boolean up    = x > colMin.get(y); // smaller x 
            boolean down  = x < colMax.get(y); // larger x

            if (left && right && up && down) {
                covered++;
            }
        }

        return covered;
    }
}