class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int minLen=0;
        String result="";
        if(len1>len2){
            minLen=len2;
        }
        else if(len2>len1){
            minLen=len1;
        }
        else{
            minLen=len2;
        }
        for (int i = 0; i < minLen; i++) {
            result += word1.charAt(i);
            result += word2.charAt(i);
        }
        if (len1 > len2) {
            result += word1.substring(minLen);
        } else if (len2 > len1) {
            result += word2.substring(minLen);
        }
        return result;
    }
}
