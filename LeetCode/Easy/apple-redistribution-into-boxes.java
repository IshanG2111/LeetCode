// Title: Apple Redistribution into Boxes
// URL: https://leetcode.com/problems/apple-redistribution-into-boxes/
// Difficulty: Easy
// Language: java

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int totalApples = 0;
        for (int appleCount : apple) {
            totalApples += appleCount;
        }
        int boxCount = 1;
        int n = capacity.length;
        while (true) {
            totalApples -= capacity[n - boxCount];
            if (totalApples <= 0) {
                return boxCount;
            }
            boxCount++;
        }
    }
}