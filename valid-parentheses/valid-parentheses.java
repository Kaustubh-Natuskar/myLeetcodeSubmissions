class Solution {
    public boolean isValid(String s) {
        int i=0;
        if(s.length()==1)
            return false;
        if( s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']' )
            return false;
        Stack<Character> stk = new Stack<>();
        stk.push( s.charAt(i) );
        i++;
        
        while(i<=s.length()-1){
            
            if( s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' ){
                stk.push(s.charAt(i) );
                i++;
            }else if(s.charAt(i)==')'){
                
                if(stk.empty())
                    return false;
                if(stk.peek()=='('){
                    i++;
                    stk.pop();
                } else if(stk.peek()!='(' )
                    return false;
                
                
            }else if(s.charAt(i)==']'){
                
                if(stk.empty())
                    return false;
                if(stk.peek()=='['){
                    i++;
                    stk.pop();
                } else if(stk.peek()!='[')
                    return false;
            
            }else if(s.charAt(i)=='}'){
                
                if(stk.empty())
                    return false;
                if(stk.peek()=='{'){
                    i++;
                    stk.pop();
                } else if(stk.peek()!='{')
                    return false;
                
                  
             }    
                
            
        }
        if(stk.empty())
            return true;
        else
            return false;
        
    }
}