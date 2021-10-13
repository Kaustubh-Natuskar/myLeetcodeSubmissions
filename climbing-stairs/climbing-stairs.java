class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        memo.put(1, 1);
        memo.put(2, 2);
        memo.put(3, 3);
        return climbStairs(n, memo);
    }

    private int climbStairs(int n, Map<Integer, Integer> memo) {
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        int oneStep= climbStairs(n-1,memo);
        int twoStep= climbStairs(n-2,memo);
        memo.put(n,oneStep+twoStep);
        return memo.get(n);
       
    }
}