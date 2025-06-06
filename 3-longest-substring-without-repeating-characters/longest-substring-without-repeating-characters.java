class Solution {
    public int lengthOfLongestSubstring(String s) {
        /* int maxLength = 0;
        for(int i=0; i<s.length(); i++) {
            Set<Character> set = new HashSet<>();
            int j = i, count = 0;
            while(j<s.length() && !set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                count++;
            }
            maxLength = Math.max(maxLength, count);
            if(maxLength == s.length())
                return maxLength;
        }
        return maxLength; */
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        int l=0;
        for(int i=0; i<s.length(); i++) {
            while(set.contains(s.charAt(i))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            maxLength = Math.max(maxLength, i-l+1);
        }
        return maxLength;
    }
}