// Title: Squares of a Sorted Array
// URL: https://leetcode.com/problems/squares-of-a-sorted-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sq=nums[i]*nums[i];
            squares[i]=sq;
        }
        Arrays.sort(squares);
        return squares;
    }
}