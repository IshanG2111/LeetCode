class Solution {
    public int mySqrt(int x) {
        int i=1;
        int count=0;
        while(x>0){
            x-=i;
            i=i+2;
            if(x>=0){
            count++;
            }
        }
        return count;
    }
}
