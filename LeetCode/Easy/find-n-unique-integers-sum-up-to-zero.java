// Title: Find N Unique Integers Sum up to Zero
// URL: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] sumZero(int n) {
        int []arr=new int[n];
        int []negtemp=new int[n/2];
        if(n<=1){
            arr[0]=0;
            return arr;
        }
        for(int i=0;i<n/2;i++){
            arr[i]=i+1;
            arr[n-1-i]=-1*(i+1);
        }
        if (n % 2 == 1) {
            arr[n / 2] = 0;
        }
        return arr;
    }
}