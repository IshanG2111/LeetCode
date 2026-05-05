// Title: Water Bottles II
// URL: https://leetcode.com/problems/water-bottles-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
         int empty=numBottles;
        while(numBottles>=numExchange){
            numBottles-=numExchange-1;
            empty+=1;
            numExchange+=1;
        }
        return empty;
    }
}