// Title: Sort Integers by The Number of 1 Bits
// URL: https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] sortByBits(int[] arr) {
        // int[] priority=new int[arr.length];
        // Map<Integer, List<Integer>> map = new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        // int count=Integer.bitCount(arr[i]);
        // priority[i]=count;
        // }
        // Arrays.sort(priority);
        // return priority;
        for(int i=0;i<arr.length;i++){
            arr[i]+=Integer.bitCount(arr[i])*10001;
        }
        Arrays.sort(arr);
        for (int i = 0;i<arr.length;i++) {
            arr[i] %= 10001;
        }
        return arr;
    }
}