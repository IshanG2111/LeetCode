class Solution {
    public String addBinary(String a, String b) {
        String add="";
        int l1=b.length();
        int l2=a.length();
        int greater=0;
        int carry=0;
        if(l1>l2){
            greater=l1;
        }
        else{
            greater=l2;
        }
        int i=l2-1;
        int j=l1-1;
        while(greater>0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if (j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            add=(sum%2)+add;
            carry=sum/2;
            greater--;
        }
        if(carry>0){
            add ="1"+add;
        }
        return add;
    }
}
