class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk= new Stack<>();
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '[' || curr == '{'){
                stk.push(s.charAt(i));
            } else {
                if(stk.empty()) return false;
                
                char last = stk.pop();
                if(last == '(' && curr != ')')
                    return false;
                if(last == '[' && curr != ']')
                    return false;
                if(last == '{' && curr != '}')
                    return false;
            }
        }
        
        return stk.empty();
    }
}