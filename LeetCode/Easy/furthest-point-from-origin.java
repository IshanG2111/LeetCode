// Title: Furthest Point From Origin
// URL: https://leetcode.com/problems/furthest-point-from-origin/
// Difficulty: Easy
// Language: java

class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0;
        int countR = 0;
        int blanks = 0;

        for (char c : moves.toCharArray()) {
            if (c == 'L') {
                countL++;
            } else if (c == 'R') {
                countR++;
            } else {
                blanks++;
            }
        }
        int net = countR - countL;
        return Math.abs(net) + blanks;
    }
}