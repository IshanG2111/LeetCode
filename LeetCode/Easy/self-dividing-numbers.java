// Title: Self Dividing Numbers
// URL: https://leetcode.com/problems/self-dividing-numbers/
// Difficulty: Easy
// Language: java

class Solution {
    private boolean isTrue(int num) {
        int ori=num;
        int d=0;
        while(num>0){
            d=num%10;
            if(d==0 || ori%d!=0){
                return false;
            }
            num/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isTrue(i)){
                result.add(i);
            }
        }
        return result;
    }
}