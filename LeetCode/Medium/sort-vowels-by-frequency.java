// Title: Sort Vowels by Frequency
// URL: https://leetcode.com/problems/sort-vowels-by-frequency/
// Difficulty: Medium
// Language: java

class Solution {
    public String sortVowels(String s) {
        // String vowels="aeiouAEIOU";
        // List<Character> list=new ArrayList<>();
        // for(char c:s.toCharArray()){
        //     if(vowels.indexOf(c)!=-1){
        //         list.add(c);
        //     }
        // }
        // Collections.sort(list);
        // StringBuilder sb=new StringBuilder();
        // int index=0;
        // for(char c:s.toCharArray()){
        //     if(vowels.indexOf(c)!=-1){
        //         sb.append(list.get(index++));
        //     }
        //     else{
        //         sb.append(c);
        //     }
        // }
        // return sb.toString();
        int[] counter=new int[128];
        int[] first=new int[128];
        int n=s.length();
        Arrays.fill(first,-1);
        char[] chars=s.toCharArray();

        for(int i=0;i<n;i++){
            char c=chars[i];
            counter[c]++;
            if(first[c]==-1){
                first[c]=i;
            }
        }
        String vowels="aeiou";
        List<Character>dis=new ArrayList<>();
        for(char v:vowels.toCharArray()){
            if(counter[v]>0){
                dis.add(v);
            }
        }
        dis.sort((a,b)->{
            if(counter[a]!=counter[b]){
                return counter[b]-counter[a];
            }
            return first[a]-first[b];
        });
        int var=0;
        int used=0;
        for(int i=0;i<n;i++){
            if(vowels.indexOf(chars[i])!=-1){
                char replace=dis.get(var);
                chars[i]=replace;
                if(++used==counter[replace]){
                    var++;
                    used=0;
                }
            }
        }
        return new String(chars);
    }
}