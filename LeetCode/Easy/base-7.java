// Title: Base 7
// URL: https://leetcode.com/problems/base-7/
// Difficulty: Easy
// Language: java

class Solution {
    public String convertToBase7(int num) {
        String str="";
        String r="";
        if(num==0){
            return "0";
        }
        if(num<0){
            return "-"+convertToBase7(-num);
        }
        if(num<7){
            return String.valueOf(num);
        }
        else{
            return convertToBase7(num/7)+String.valueOf(num%7);
        }
    }
}