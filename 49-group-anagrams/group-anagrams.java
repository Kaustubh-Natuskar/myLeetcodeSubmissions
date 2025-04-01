class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strs) {
            int[] freqArr = new int[26];
            for (int i=0; i<s.length(); i++) {
                freqArr[s.charAt(i) - 'a']++;
            }
            String freqArrString = Arrays.toString(freqArr);
            map.putIfAbsent(freqArrString, new ArrayList<String>());
            map.get(freqArrString).add(s);
        }

        return new ArrayList<>(map.values());
    }
}