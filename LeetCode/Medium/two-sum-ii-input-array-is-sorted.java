// Title: Two Sum II - Input Array Is Sorted
// URL: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Difficulty: Medium
// Language: java

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int i, j;
        int[] result = {};
        for (i = 0; i < numbers.length; i++) {
            j = target - numbers[i];
            if (map.containsKey(j)) {
                return new int[] { map.get(j), i+1 };
            }
            map.put(numbers[i], i+1);
        }
        return new int[] {};
    }
}