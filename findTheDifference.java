class Solution {
    public char findTheDifference(String s, String t) {
        int i;
        int S=0;
        int T=0;
        for(i =0;i<s.length();i++){
            S+=s.charAt(i);
        }
        for(i=0;i<t.length();i++){
            T+=t.charAt(i);
        }
        char result=(char)(T-S);
        return result;
    }
}
