class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        if(x<0){
            return false;
        }
        int rem;
        int rev=0;
        while(x!=0){
            rem=(int)(x%10);
            rev=(rev*10)+rem;
            x=x/10;
        }
        if(rev==original){
            return true;
        }
        else{
            return false;
        }
    }
}
