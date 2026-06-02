// Title: To Lower Case
// URL: https://leetcode.com/problems/to-lower-case/
// Difficulty: Easy
// Language: java

class Solution {
    public String toLowerCase(String s) {
    //    return s.toLowerCase(); 
    StringBuilder ans=new StringBuilder();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch>='A' && ch<='Z'){
            ch=(char)(ch+32);
        }
        ans.append(ch);
    }
    return ans.toString();
    }
}