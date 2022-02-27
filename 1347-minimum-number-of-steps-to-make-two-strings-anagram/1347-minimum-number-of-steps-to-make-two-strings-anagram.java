class Solution {
    public int minSteps(String s, String t) {
        int[] m = new int[26];
        int ans=0;
        for(int i=0; i<s.length(); i++){
            m[s.charAt(i) - 'a']++;    
        }
        for(int i=0; i<t.length(); i++){
            m[t.charAt(i) - 'a']--;    
        }
        for(int i=0; i<26; i++){
            if(m[i] < 0) continue;
            ans+=m[i];
        }
        return ans;
    }
}