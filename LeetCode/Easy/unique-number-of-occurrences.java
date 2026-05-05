// Title: Unique Number of Occurrences
// URL: https://leetcode.com/problems/unique-number-of-occurrences/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        
        for(int num:arr){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        HashSet<Integer> n = new HashSet<>(m.values());
        return m.size() == n.size();
    }
}