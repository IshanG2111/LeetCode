// Title: Reverse String
// URL: https://leetcode.com/problems/reverse-string/
// Difficulty: Easy
// Language: java

class Solution {
    public void reverseString(char[] s) {
        int front = 0;
        int end = s.length - 1;
        char temp;

       while(front<end) { 
            temp = s[front];
            s[front] = s[end];
            s[end] = temp;
            front++;
            end--;
        }
    }
}