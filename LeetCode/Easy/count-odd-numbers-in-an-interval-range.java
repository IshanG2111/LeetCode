// Title: Count Odd Numbers in an Interval Range
// URL: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/
// Difficulty: Easy
// Language: java

class Solution {
    public int countOdds(int low, int high) {
    return (high + 1) / 2 - low / 2;
    }
}