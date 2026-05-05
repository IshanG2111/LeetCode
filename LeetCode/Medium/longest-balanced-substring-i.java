// Title: Longest Balanced Substring I
// URL: https://leetcode.com/problems/longest-balanced-substring-i/
// Difficulty: Medium
// Language: java

class Solution {
    public boolean checkBalanced(int[] arr){
        int c=0;
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                continue;
            }
            if(c==0){
                c=arr[i];
            }
            else if(arr[i]!=c){
                return false;
            }
        }
        return true;
    }
    public int longestBalanced(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            int[] arr=new int[26];
            for(int j=i;j<s.length();j++){
                arr[s.charAt(j) - 'a']++;
                if(checkBalanced(arr)){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}