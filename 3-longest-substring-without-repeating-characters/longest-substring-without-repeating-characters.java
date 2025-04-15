class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for(int i=0; i<s.length(); i++) {
            Set<Character> set = new HashSet<>();
            int j = i, count = 0;
            while(j<s.length() && !set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                count++;
            }
            maxLength = Math.max(maxLength, count);
        }
        return maxLength; 
    }
}