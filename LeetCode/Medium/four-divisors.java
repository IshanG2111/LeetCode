// Title: Four Divisors
// URL: https://leetcode.com/problems/four-divisors/
// Difficulty: Medium
// Language: java

class Solution {
    public int sumFourDivisors(int[] nums) {
        int totalSum=0;
        for(int s=0;s<nums.length;s++){
            int n=nums[s];
            int count=0;
            int sum=0;

            for(int i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    int d1=i;
                    int d2=n/i;
                    if(d1==d2){ 
                        count++;
                        sum+=d1;
                    }else{
                        count+=2;
                        sum+=d1+d2;
                    }
                    if(count>4) {
                        break;
                    }
                }
            }
            if(count==4) {
                totalSum+=sum;
            }
        }
        return totalSum;
    }
}
