// Title: Find Most Frequent Vowel and Consonant
// URL: https://leetcode.com/problems/find-most-frequent-vowel-and-consonant/
// Difficulty: Easy
// Language: java

class Solution {
    public int maxFreqSum(String s) {
        char[] str = s.toCharArray();
        Set<Character> map = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : str) {
            if (Character.isLetter(c)) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
        }
        char maxV = '_';
        char maxC = '_';
        int vSum = 0;
        int cSum = 0;
        for (char c : freq.keySet()) {
            int f = freq.get(c);
            if (map.contains(c)) {
                if (f > vSum) {
                    vSum = f;
                    maxV = c;
                }
            } else {
                if (f > cSum) {
                    cSum = f;
                    maxC = c;
                }
            }
        }
        return vSum + cSum;
    }
}