class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int l=0, res=0;

        for(int r=0; r<s.length(); r++){
            char curr = s.charAt(r);
            map[curr - 'A']++;
            int maxFreq = findLargestFreqInMap(map);

            while((r-l+1) - maxFreq > k){
                map[s.charAt(l) - 'A']--;
                l++;
            }

            res = Math.max(res, (r-l+1));
        }
        return res;
    }

    public int findLargestFreqInMap(int[] map){
        int largest = 0;
        for(int i=0; i<26; i++){
            largest = Math.max(largest, map[i]);
        }
        return largest;

    }
}