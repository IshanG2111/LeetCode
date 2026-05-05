// Title: Isomorphic Strings
// URL: https://leetcode.com/problems/isomorphic-strings/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Character>map1=new HashMap<>();
        int i=0;
        while(i<s.length()){
            if(map1.containsKey(s.charAt(i))){
                if(map1.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            } else if(map1.containsValue(t.charAt(i))){
                return false;
            } else {
                map1.put(s.charAt(i),t.charAt(i));
            }
            i++;
        }
        return true;

    }
}