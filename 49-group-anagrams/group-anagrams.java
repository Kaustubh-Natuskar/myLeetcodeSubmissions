class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String s : strs) {
            int[] arr = new int[26];
            for(int i=0; i<s.length(); i++) {
                arr[s.charAt(i) - 'a']++;
            }
            String arrString = Arrays.toString(arr);
            map.putIfAbsent(arrString, new ArrayList<String>());
            map.get(arrString).add(s);
        }
        return new ArrayList<>(map.values());
    }

}