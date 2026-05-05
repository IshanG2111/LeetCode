// Title: Find All Numbers Disappeared in an Array
// URL: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Difficulty: Easy
// Language: java

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] present = new boolean[n + 1];

        for (int num : nums) {
            present[num] = true;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                result.add(i);
            }
        }
        return result;
    }
}