// Title: Rotated Digits
// URL: https://leetcode.com/problems/rotated-digits/
// Difficulty: Medium
// Language: java

class Solution {
    public int rotatedDigits(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 1);
        map.put(2, 5);
        map.put(5, 2);  
        map.put(2, 5);
        map.put(6, 9);
        map.put(8, 8);
        map.put(9, 6);
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            int original = num;
            int rotated = 0;
            int pos = 1;
            boolean isGood = false;
            while (num > 0) {
                int digit = num % 10;
                if (!map.containsKey(digit)) {
                    isGood = false;
                    break;
                }
                if (digit == 6 || digit == 9|| digit==2 || digit==5) {
                    isGood = true;
                }
                rotated = map.get(digit) * pos + rotated;
                pos *= 10;
                num /= 10;
            }
            if (isGood && rotated != original) {
                count++;
            }
        }
        return count;
    }
}