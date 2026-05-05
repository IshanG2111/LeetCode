// Title: Kids With the Greatest Number of Candies
// URL: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
// Difficulty: Easy
// Language: java

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
         List<Boolean> booleanList = new ArrayList<>();
          int currentMax = 0;
        for (int c : candies) {
            if (c > max) {
                max = c;
            }
        }
        for(int c:candies){
            if((c+extraCandies)>=max){
                booleanList.add(true);
            }
            else{
                booleanList.add(false);
            }
        }
        return booleanList;
    }
}