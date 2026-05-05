// Title: Container With Most Water
// URL: https://leetcode.com/problems/container-with-most-water/
// Difficulty: Medium
// Language: java

class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int w=right-left;
            int area=w*h;
            maxArea=Math.max(maxArea,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}