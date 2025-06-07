//not final code

//just the process

import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) {
        int i;
        int result=0;
        for(i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char nch=s.charAt(i+1);
           switch(ch){
            case 'I':
            if(nch =='V' || nch =='X'){
                if(nch=='V'){
                    result+=4;
                    i++;
                }
                else{
                    result+=9;
                    i++;
                }
            }
            else{
               result+=1;
            }
               break;
            case 'V':
                result+=5;
                break;
            case 'X':
                result+=10;
                break;
            case 'L':
                result+=50;
                break;
            case 'C':
                result+=100;
                break;
            case 'D':
                result+=500;
                break;
            case 'M':
                result+=1000;
                break;
            default:
                result+=0; 
                break;
        }
        }
        return result;
    }
}
public class demo {
    
    public static void main(String[] args) {
        // Map<Integer, Character> map = new HashMap<>();
        // map.put(0, 'I');
        // map.put(1, 'V');
        // map.put(2, 'X');
        // map.put(3, 'L');
        // map.put(3, 'C');
        // map.put(4, 'D');
        // map.put(5, 'M');
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
        String s="LVIII";
        // Solution solution=new Solution();
        // int r=solution.romanToInt(s);
        // System.out.println(r);
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
    System.out.println(sum);
    }
}
