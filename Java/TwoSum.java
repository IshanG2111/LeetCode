class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int i, j;
        int[] result = {};
        for (i = 0; i < nums.length; i++) {
            j = target - nums[i];
            if (map.containsKey(j)) {
                return new int[] { map.get(j), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
