class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        for(int i=0; i<sArr.length; i++){
            char currS = sArr[i];
            char currT = tArr[i];

            if(sMap.containsKey(currS)){
                sMap.put(currS, sMap.get(currS)+1);
            } else {
                sMap.put(currS, 1);
            }
            if(tMap.containsKey(currT)){
                tMap.put(currT, tMap.get(currT)+1);
            } else {
                tMap.put(currT, 1);
            }
        }

        return sMap.equals(tMap);
    }
}