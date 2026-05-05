// Title: Removing Stars From a String
// URL: https://leetcode.com/problems/removing-stars-from-a-string/
// Difficulty: Medium
// Language: java

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                if(stack.isEmpty()==false){
                    stack.pop();
                }
            } 
            else{
                stack.push(ch);
            }
        }
        char[] result = new char[stack.size()];
        int i=0;
        for (char c : stack){
            result[i++]=c;
        }
        return  new String(result);
    }
}