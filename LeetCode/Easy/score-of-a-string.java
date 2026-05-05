// Title: Score of a String
// URL: https://leetcode.com/problems/score-of-a-string/
// Difficulty: Easy
// Language: java

class Solution {
    public int scoreOfString(String s) {
        char[] charArray = s.toCharArray();
        int[] intArray = new int[charArray.length];
        for(int i=0;i<intArray.length;i++){
            intArray[i] = charArray[i];
        }
        int sum=0;
        for(int i=0;i<intArray.length-1;i++){
            sum+=Math.abs(intArray[i]-intArray[i+1]);
        }
        return sum;
    }
}