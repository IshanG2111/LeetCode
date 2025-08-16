class Solution {
    public long[] sumOfThree(long num) {
        long x=0;
        long []empty={};
        if(num%3==0){
            x=num/3;
            long []temp={x-1,x,x+1};
            return temp;
        }
        return empty;
    }
}
