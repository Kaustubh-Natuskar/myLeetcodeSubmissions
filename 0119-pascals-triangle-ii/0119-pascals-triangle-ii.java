class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long res = 1;
        ans.add(1);

        for(int col=0; col<rowIndex; col++) {
            res = res * (rowIndex-col);
            res = res / (col+1);
            ans.add((int)res);
        }

        return ans;
    }
}