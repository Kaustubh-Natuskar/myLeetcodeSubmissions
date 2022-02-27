class Solution {
    public int prefixCount(String[] words, String pref) {
        int pl= pref.length();
        int ans=0;
        boolean flag = false;
        for(int i=0; i<words.length; i++){
            
            String s = words[i];
            if(s.length() < pl) continue;
            flag=false;
            for(int j=0; j<pl; j++){
                if(s.charAt(j) != pref.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(flag != true){
                ans++;
            }
            
        }
        
        return ans;
        
    }
    
}