class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        for (char c : s1.toCharArray()) {
            s1Map[c - 'a']++;
        }

        int window = s1.length();

        for (int i = 0; i < window; i++) {
            s2Map[s2.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s2.length() - window; i++) {
            if (matches(s1Map, s2Map)) {
                return true;
            }

            // Slide the window: remove the leftmost character and add the next character
            if (i + window < s2.length()) {
                s2Map[s2.charAt(i) - 'a']--;
                s2Map[s2.charAt(i + window) - 'a']++;
            }
        }

        return matches(s1Map, s2Map);
    }

    public boolean matches(int[] s1Map, int[] s2Map) {
        for (int i = 0; i < 26; i++) {
            if (s1Map[i] != s2Map[i]) {
                return false;
            }
        }
        return true;
    }
}
