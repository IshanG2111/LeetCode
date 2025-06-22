class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int i;
        int[] lengths = new int[nums.length];
        for (i = 0; i < nums.length; i++) {
            lengths[i] = String.valueOf(nums[i]).length();
            if (lengths[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
