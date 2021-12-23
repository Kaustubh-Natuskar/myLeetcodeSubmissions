class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int left=0;
        int a=0;
        HashMap<Character,Integer> memo = new HashMap<>();
        
        for (int right=0;right<s.length();right++){
            Character currCar = s.charAt(right);
            
            if(memo.containsKey(currCar) && memo.get(currCar) >= left)
                left = memo.get(currCar) +1;
            
            a = right-left+1;
            memo.put(currCar,right);
            ans=Math.max(ans,a);
        }
        return ans;
    }
}