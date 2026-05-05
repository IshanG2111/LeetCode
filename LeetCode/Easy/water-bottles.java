// Title: Water Bottles
// URL: https://leetcode.com/problems/water-bottles/
// Difficulty: Easy
// Language: java

class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=numBottles;
        while(numBottles>=numExchange){
            numBottles-=numExchange-1;
            empty+=1;
        }
        return empty;
    }
}