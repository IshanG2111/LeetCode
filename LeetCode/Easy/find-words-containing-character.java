// Title: Find Words Containing Character
// URL: https://leetcode.com/problems/find-words-containing-character/
// Difficulty: Easy
// Language: java

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       List<Integer> result = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x) != -1){
                result.add(i);
            }
        }
        return result;
    }
}