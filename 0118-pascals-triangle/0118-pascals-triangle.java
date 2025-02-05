class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for(int i=0; i<numRows; i++) {
            list.add(getRow(i));
        }

        return list;
    }

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