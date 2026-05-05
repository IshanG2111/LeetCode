// Title: Largest 3-Same-Digit Number in String
// URL: https://leetcode.com/problems/largest-3-same-digit-number-in-string/
// Difficulty: Easy
// Language: java

import java.util.LinkedHashMap; // Import LinkedHashMap for guaranteed insertion order
import java.util.Map;

class Solution {
    public String largestGoodInteger(String num) {
        String s10="000";
        String s9="111";
        String s8="222";
        String s7="333";
        String s6="444";
        String s5="555";
        String s4="666";
        String s3="777";
        String s2="888";
        String s1="999";
        
        Map<String, String> sub = new LinkedHashMap<>(); 
        sub.put(s1,"999");
        sub.put(s2,"888");
        sub.put(s3,"777");
        sub.put(s4,"666");
        sub.put(s5,"555");
        sub.put(s6,"444");
        sub.put(s7,"333");
        sub.put(s8,"222");
        sub.put(s9,"111");
        sub.put(s10, "000"); 

        for (Map.Entry<String, String> entry : sub.entrySet()) {
            if (num.contains(entry.getKey())) { 
                return entry.getValue(); 
            }
        }
        return ""; 
    }
}
