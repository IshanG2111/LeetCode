class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int t=(int)target;
        int mint=0;
        for(int i=0;i<letters.length;i++){
            mint = (int) letters[i] - t;
            if (mint > 0) {
                return letters[i];
            }
        }
        return letters[0];
    }
}
