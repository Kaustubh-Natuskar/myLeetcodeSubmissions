class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] charS = s.toCharArray();
            Arrays.sort(charS);
            String sortedStringS = new String(charS);
            map.putIfAbsent(sortedStringS, new ArrayList<>());
            map.get(sortedStringS).add(s);
        }
        return new ArrayList<>(map.values());
    }
}