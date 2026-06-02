// Title: Earliest Finish Time for Land and Water Rides I
// URL: https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i/
// Difficulty: Easy
// Language: java

class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int end = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            end = Math.min(end, landStartTime[i] + landDuration[i]);
        }
        int minWaterEnd = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; i++) {
            minWaterEnd = Math.min(minWaterEnd, waterStartTime[i] + waterDuration[i]);
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < waterStartTime.length; i++) {
            ans = Math.min(ans,Math.max(end, waterStartTime[i]) + waterDuration[i]);
        }
        for (int i = 0; i < landStartTime.length; i++) {
            ans = Math.min(ans,Math.max(minWaterEnd, landStartTime[i]) + landDuration[i]);
        }
        return ans;
    }
}