// Title: Greatest Common Divisor of Strings
// URL: https://leetcode.com/problems/greatest-common-divisor-of-strings/
// Difficulty: Easy
// Language: java

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String largest;
        String smaller;
        if(str1.length()>str2.length()){
            largest=str1;
            smaller=str2;
        }
        else{
            largest=str2;
            smaller=str1;
        }
        if ((str1 + str2).equals(str2 + str1)==false) {
            return "";
        }
        while (largest.equals(smaller)==false) {
            if (largest.length() > smaller.length()) {
                largest = largest.substring(smaller.length());
            } else {
                smaller = smaller.substring(largest.length());
            }
        }
        return largest;
    }
}