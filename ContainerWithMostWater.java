//Draft 1 passes intial test cases
class Solution {
    public int maxArea(int[] height) {
         int maxHeight = 0;
         for (int i = 0; i < height.length - 1; i++) {
             for (int j = i + 1; j < height.length; j++) {
                 int currentHeight = Math.min(height[i], height[j]);
                 int width = j - i;
                 int currentArea = currentHeight * width;
                 maxHeight = Math.max(maxHeight, currentArea);
            }
        }
        return maxHeight;
    }
}
