class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        Map<Character, char[]> keyboard = Map.of(
            '2', new char[]{'a','b','c'},
            '3', new char[]{'d','e','f'},
            '4', new char[]{'g','h','i'},
            '5', new char[]{'j','k','l'},
            '6', new char[]{'m','n','o'},
            '7', new char[]{'p','q','r','s'},
            '8', new char[]{'t','u','v'},
            '9', new char[]{'w','x','y','z'}
        );
        result.add("");
        for(char d: digits.toCharArray()){
            List<String> temp = new ArrayList<>();
            for(String s: result){
                for(char c:keyboard.get(d)){
                    temp.add(s+c);
                }
            }
            result=temp;
        }
        return result;
    }
}
