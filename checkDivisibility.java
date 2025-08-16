class Solution {
    public boolean checkDivisibility(int n) {
        int original=n;
        int s=0;
        int p=1;
        int temp=0;
        while(n>0){
            temp=n%10;
            s+=temp;
            p*=temp;
            n/=10;
        }
        if((s + p) != 0 && original % (s + p) == 0){
            return true;
        }
        return false;
    }
}
