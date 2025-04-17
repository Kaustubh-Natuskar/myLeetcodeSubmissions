class Solution {
    public boolean isValid(String s) {
        if(s.length() == 1)
            return false;
        
        Stack<Character> stk= new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{')
                stk.push(c);
            else if(stk.empty()) {
                return false;
            } else {
                char curr = stk.pop();
                if(c == ')' && curr != '(')
                    return false;
                if(c == ']' && curr != '[')
                    return false;
                if(c == '}' && curr != '{')
                    return false;
            }
        }

        return stk.empty();
    }
}