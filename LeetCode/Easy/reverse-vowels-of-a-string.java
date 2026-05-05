// Title: Reverse Vowels of a String
// URL: https://leetcode.com/problems/reverse-vowels-of-a-string/
// Difficulty: Easy
// Language: java

class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        char temp;
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && (str[l] != 'a' && str[l] != 'e' && str[l] != 'i' && str[l] != 'o' && str[l] != 'u' &&
                    str[l] != 'A' && str[l] != 'E' && str[l] != 'I' && str[l] != 'O' && str[l] != 'U')) {
                l++;
            }
            while (l < r && (str[r] != 'a' && str[r] != 'e' && str[r] != 'i' && str[r] != 'o' && str[r] != 'u' &&
                    str[r] != 'A' && str[r] != 'E' && str[r] != 'I' && str[r] != 'O' && str[r] != 'U')) {
                r--;
            }
            temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++;
            r--;
        }
        return new String(str);
    }
}