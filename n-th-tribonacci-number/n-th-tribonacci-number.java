class Solution {
    public int tribonacci(int n) {
        return tribo(n , new HashMap<Integer,Integer>());
    }
    public int tribo(int n, HashMap<Integer,Integer> map ){
        
        if(n <= 1)
            return n;
        
        if(n == 2)
            return 1;
        
        int currKey=n;
        
        if(map.containsKey(currKey))
            return map.get(currKey);
        
        int oneBack= tribo(n-1,map);
        int twoBack= tribo(n-2, map);
        int threeBack= tribo(n-3, map);
        
        map.put(currKey, oneBack + twoBack + threeBack);
        return oneBack + twoBack + threeBack;
    }
}