class Solution {
    public int reverse(int x) {
        int y = x;
        int r = 0;
        int si = 0;
        if (x < 0) {
            x = x * -1;
            si = 1;
        }
        while (x > 0) {
            int n = x % 10;
            if (r > (Integer.MAX_VALUE - n) / 10) {
                return 0;
            }
            r = r * 10 + n;
            x /= 10;
        }
        if (y < 0) {
            r = -r;
        }
        double a = Math.pow(-2, 31); // -2147483648
        double b = Math.pow(2, 31); // 2147483648

        if (r < a || r >= b) {
            return 0;
        }

        return r;
    }
}