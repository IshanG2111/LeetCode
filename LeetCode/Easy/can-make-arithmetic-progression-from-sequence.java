// Title: Can Make Arithmetic Progression From Sequence
// URL: https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int inc=arr[1]-arr[0];
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]+inc!=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}