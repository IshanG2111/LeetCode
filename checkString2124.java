class Solution {
    public boolean checkString(String s) {
        char[] str=s.toCharArray();
        for(int i=0;i<s.length()-1;i++){
            if(str[i]=='b' && str[i+1]=='a'){
                return false;
            }
        }
        return true;
    }
}
