// Title: Set Mismatch
// URL: https://leetcode.com/problems/set-mismatch/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 1];
        int[] result = new int[2];

        for (int num : nums) {
            arr[num]++;
        }

        for (int i = 1; i <= n; i++) {
            if (arr[i] == 2) result[0] = i;
            if (arr[i] == 0) result[1] = i;
        }

        return result;
    }
}
