class Solution {
    public boolean isPowerOfFour(int n) {
        int original=n;
        if (n < 0) {
            return false;
        }
        double base=4;
        double count= Math.log(n) / Math.log(base);
        int m = (int) Math.round(count);
        if(Math.pow(base,m)==original){
            return true;
        }
        return false;
    }
}
