class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        /*for(String s : strs){
            char[] charS = s.toCharArray();
            Arrays.sort(charS);
            String sortedStringS = new String(charS);
            map.putIfAbsent(sortedStringS, new ArrayList<>());
            map.get(sortedStringS).add(s);
        } */
        for(String s: strs){
            int[] countMap = new int[26];
            for(char c : s.toCharArray())
                countMap[c - 'a']++;
            String countMapString = Arrays.toString(countMap);
            map.putIfAbsent(countMapString, new ArrayList<>());
            map.get(countMapString).add(s);
        }
        return new ArrayList<>(map.values());
    }
}