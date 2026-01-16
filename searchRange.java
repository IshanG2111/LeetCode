class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int[] result = { -1, -1 };

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                int l = mid;
                while (l - 1 >= 0 && nums[l - 1] == target) l--;
                int r = mid;
                while (r + 1 < nums.length && nums[r + 1] == target) r++;

                result[0] = l;
                result[1] = r;
                return result;   
            } 
            else if (nums[mid] < target) {
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }
        return result;
    }
}
