class Solution {
    public boolean isAnagram(String s, String t) {
        /* //Two Maps
        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(int i=0; i<s.length(); i++)
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);

        for(int i=0; i<t.length(); i++)
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);

        return sMap.equals(tMap); 
        */

        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> sMap = new HashMap<>();

        for(int i=0; i<s.length(); i++)
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);

        for(int i=0; i<t.length(); i++){
            char tChar = t.charAt(i);

            if(!sMap.containsKey(tChar))
                return false;
            
            sMap.put(tChar, sMap.get(tChar) - 1);

            if(sMap.get(tChar) == 0)
                sMap.remove(tChar);
        }
        
        return sMap.isEmpty();
    }
}