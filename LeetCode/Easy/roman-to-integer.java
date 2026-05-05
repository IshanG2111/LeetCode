// Title: Roman to Integer
// URL: https://leetcode.com/problems/roman-to-integer/
// Difficulty: Easy
// Language: java

class Solution {
    public int romanToInt(String s) {
     int sum=0;
        Map<Character, Integer> map = new HashMap<>();

        map.put('I',0 );
        map.put('V',1 );
        map.put('X',2 );
        map.put('L',3 );
        map.put('C',4 );
        map.put('D',5 );
        map.put('M',6 );

        Map<Integer, Integer> value = new HashMap<>();

        value.put(0, 1);
        value.put(1, 5);
        value.put(2, 10);
        value.put(3, 50);
        value.put(4, 100);
        value.put(5, 500);
        value.put(6, 1000);
        System.out.println(map.get('D')>map.get('C'));
        int v1=0;
        int v2=0;
        int i;
        for (i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (i+1<s.length()) {
                char nch=s.charAt(i+1);
                if (map.get(ch)<map.get(nch)==true) {
                    v1=value.get(map.get(ch));
                    v2=value.get(map.get(nch));
                    sum+=v2-v1;
                    i++;
                }
                else{
                    sum+=value.get(map.get(ch));
                }
            
        }
        else{
            sum+=value.get(map.get(ch));
        }
    }
    return sum;
}
}