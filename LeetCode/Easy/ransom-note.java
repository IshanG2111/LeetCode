// Title: Ransom Note
// URL: https://leetcode.com/problems/ransom-note/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0;i<ransomNote.length();i++){
            String ch=String.valueOf(ransomNote.charAt(i));
            if(magazine.contains(ch)){
                magazine=magazine.replaceFirst(ch,"");
            }else{
                return false;
            }
        }
        return true;
    }
}
