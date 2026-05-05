// Title: Sum of Distances
// URL: https://leetcode.com/problems/sum-of-distances/
// Difficulty: Medium
// Language: java

class Solution {
    public long[] distance(int[] nums) {
        long[] arr = new long[nums.length];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            int n = list.size();
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += list.get(i);
            }
            long leftSum = 0;
            for (int i = 0; i < n; i++) {
                int id = list.get(i);
                sum -= id;
                arr[id] = (long) id * i - leftSum + sum - (long) id * (n - i - 1);
                leftSum += id;
            }
        }
        return arr;
    }
}