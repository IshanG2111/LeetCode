class Solution {
    public boolean isValid(String s) {
        Stack<Character> valid = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                valid.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (valid.isEmpty()) {
                    return false;
                }
                char o = valid.pop();
                if ((c == ')' && o != '(') || 
                    (c == '}' && o != '{') || 
                    (c == ']' && o != '[')) {
                    return false;
                }
            }
        }
        return valid.isEmpty();
    }
}
