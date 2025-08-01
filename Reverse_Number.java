class Solution {
    public int reverse(int x) {
        int y = x;
        int si = 0;
        if (x < 0) {
            x = x * -1;
            si++;
        } 
        int r = 0;
        while (x > 0) {
            int n = x % 10;
            r = (r * 10) + n;
            x /= 10;
        }
        if (y < 0) {
            r = r * -1;
        }
        double a = Math.pow(-2, 31);
        double b = Math.pow(2, 31);
        double c = Math.pow(2, 32);
        if (si > 0) {
            //represents signed integer
            if (r >= a && r <= (b - 1)) {
                return 0;
            }
        } 
        return r;
    }
}
