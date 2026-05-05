// Title: Prime Number of Set Bits in Binary Representation
// URL: https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
// Difficulty: Easy
// Language: java

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int resi=0;
        for (int i=left;i<=right;i++) {
            int setBits=Integer.bitCount(i);
            if (((665772 >> setBits) & 1) == 1) {
                resi++;
            }
        }
        return resi;
    }
}