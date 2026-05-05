// Title: Two Furthest Houses With Different Colors
// URL: https://leetcode.com/problems/two-furthest-houses-with-different-colors/
// Difficulty: Easy
// Language: java

class Solution {
    public int maxDistance(int[] colors) {
        int start = 0;
        int end = colors.length - 1;
        int diff = 0;
        while (start < colors.length) {
            int tempEnd = end;
            while (tempEnd > start) {
                if (colors[start] != colors[tempEnd]) {
                    diff = Math.max(diff, tempEnd - start);
                    break;
                }
                tempEnd--;
            }
            start++;
        }
        return diff;
    }
}