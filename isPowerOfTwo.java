class Solution {
    public boolean isPowerOfTwo(int n) {
        int original=n;
        if (n < 0) {
            return false;
        }
        double base=2;
        double count= Math.log(n) / Math.log(base);
        int m = (int) Math.round(count);
        if(Math.pow(2,m)==original){
            return true;
        }
        return false;

    }
}
