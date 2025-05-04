class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int l=0, maxfreq = 0, n=s.length(), ans=0;

        for(int r=0; r<n; r++) {
            map[s.charAt(r) - 'A']++;
            maxfreq = Math.max(maxfreq, map[s.charAt(r) - 'A']);
            while((r-l+1) - maxfreq > k) {
                map[s.charAt(l) - 'A']--;
                for(int i=0; i<26; i++) {
                   maxfreq = Math.max(maxfreq, map[i]);
                }
                l++; 
            }
            ans = Math.max(maxfreq, r-l+1);
        }

        return ans;
    }
}