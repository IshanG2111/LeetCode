// Title: Number of Employees Who Met the Target
// URL: https://leetcode.com/problems/number-of-employees-who-met-the-target/
// Difficulty: Easy
// Language: java

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count=0;
        for(int n:hours){
            if(n>=target){
                count++;
            }
        }
        return count;
    }
}