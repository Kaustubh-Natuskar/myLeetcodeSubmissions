class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<Integer>();
        if(s.length() < p.length())
            return ans;

        int[] sm = new int[26];
        int[] pm = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pm[p.charAt(i) - 'a']++;
            sm[s.charAt(i) - 'a']++;
        }

        if(Arrays.equals(sm, pm))
            ans.add(0);
        
        
        for(int i = p.length(); i<s.length(); i++) {
            sm[s.charAt(i) - 'a']++;
            sm[s.charAt(i - p.length()) - 'a']--;

            if(Arrays.equals(sm, pm)) 
                ans.add(i-p.length() + 1);
        }

        return ans;
    }
}