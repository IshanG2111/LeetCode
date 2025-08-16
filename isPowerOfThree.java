class Solution {
    public boolean isPowerOfThree(int n) {
        int original = n;
        if (n < 0) {
            return false;
        }
        double base = 3;
        double count = Math.log(n) / Math.log(base);
        int m = (int) Math.round(count);
        if (Math.pow(base, m) == original) {
            return true;
        }
        return false;

    }
}
