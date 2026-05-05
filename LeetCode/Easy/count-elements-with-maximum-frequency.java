// Title: Count Elements With Maximum Frequency
// URL: https://leetcode.com/problems/count-elements-with-maximum-frequency/
// Difficulty: Easy
// Language: java

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int maxFreq=0;
        int result=0;
        for(int num:nums){
            int count=map.getOrDefault(num,0)+1;
            map.put(num,count);
            maxFreq=Math.max(maxFreq,count);
        }
        for(int frequency:map.values()){
            if(frequency==maxFreq){
                result+=frequency;
            }
        }
        return result;
    }
}