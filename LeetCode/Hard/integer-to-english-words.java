// Title: Integer to English Words
// URL: https://leetcode.com/problems/integer-to-english-words/
// Difficulty: Hard
// Language: java

class Solution {
    public static Map<Integer,String> map;
    static{
        map=new HashMap<>();

        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");
        map.put(6,"Six");
        map.put(7,"Seven");
        map.put(8,"Eight");
        map.put(9,"Nine");
        map.put(10,"Ten");
        map.put(11,"Eleven");
        map.put(12,"Twelve");
        map.put(13,"Thirteen");
        map.put(14,"Fourteen");
        map.put(15,"Fifteen");
        map.put(16,"Sixteen");
        map.put(17,"Seventeen");
        map.put(18,"Eighteen");
        map.put(19,"Nineteen");
        map.put(20,"Twenty");
        map.put(30,"Thirty");
        map.put(40,"Forty");
        map.put(50,"Fifty");
        map.put(60,"Sixty");
        map.put(70,"Seventy");
        map.put(80,"Eighty");
        map.put(90,"Ninety");
    }
    public String numberToWords(int num) {
        if(num==0){
            return "Zero";
        }
        return helper(num).trim();
    }
    public String helper(int num){
        if(num<=19){
            return map.get(num);
        }
        if(num<100){
            return map.get((num/10)*10)+(num%10==0?"":" "+helper(num%10));
        }
        if(num<1000){
            return helper(num/100)+" Hundred"+(num%100==0?"":" "+helper(num%100));
        }
        if(num<1000000){
            return helper(num/1000)+" Thousand"+(num%1000==0?"":" "+helper(num%1000));
        }
        if(num<1000000000){
            return helper(num/1000000)+" Million"+(num%1000000==0?"":" "+helper(num%1000000));
        }
        return helper(num/1000000000)+" Billion"+(num%1000000000==0?"":" "+helper(num%1000000000));
    }
}