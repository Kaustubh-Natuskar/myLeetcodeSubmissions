class Solution {
    public int characterReplacement(String s, int k) {
        int maxf=0, l=0, ans=0;
        int[] map = new int[26];
        for(int r=0; r<s.length(); r++) {
            map[s.charAt(r) - 'A']++;
            maxf = Math.max(maxf, map[s.charAt(r) - 'A']);
            while((r-l+1) - maxf > k) {
                map[s.charAt(l) - 'A']--;
                for(int i=0; i<26; i++) {
                    maxf = Math.max(maxf, map[i]);
                }
                l++;
            }
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}