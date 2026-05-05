// Title: Find the Highest Altitude
// URL: https://leetcode.com/problems/find-the-highest-altitude/
// Difficulty: Easy
// Language: java

class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] ini = new int[n + 1];
        int a = 0;

        ini[0] = 0;
        for (int i = 0; i < n; i++) {
            a += gain[i];
            ini[i + 1] = a;
        }

        Arrays.sort(ini);
        return ini[n];
    }
}
