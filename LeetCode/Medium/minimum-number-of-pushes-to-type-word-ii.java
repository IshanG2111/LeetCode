// Title: Minimum Number of Pushes to Type Word II
// URL: https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer>freq=new HashMap<>();
        char[] w =word.toCharArray();
        for (char c : w) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        List<Integer> counts = new ArrayList<>(freq.values());
        counts.sort(Collections.reverseOrder());

        int push=0;
        for(int i=0;i<counts.size();i++){
            push+=counts.get(i)*((i/8)+1);
        }
        return push;
    }
}