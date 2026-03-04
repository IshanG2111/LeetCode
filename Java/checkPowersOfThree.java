class Solution {
    public boolean checkPowersOfThree(int n) {
        int original=n;
        int count=0;
        int r=0;
        int sum=0;
        while(n>0){
            r=n%3;
            if(r>1){
                return false;
            }
            if(r==1){
                sum+=(int)Math.pow(3,count);
            }
            n/=3;
            count++;
        }
        return sum==original;
    }
}
