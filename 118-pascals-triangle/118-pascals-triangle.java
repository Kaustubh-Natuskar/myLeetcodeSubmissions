class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer>  currRow,prevRow = null;
        for(int i=0; i<numRows; ++i){
            currRow = new ArrayList<Integer>();   //THIS IS FIRST ONE 
            for(int j=0; j<=i; j++)
                if(j == 0 || i == j)
                    currRow.add(1);
                else
                    currRow.add(prevRow.get(j-1) + prevRow.get(j));
            prevRow=currRow;
            ans.add(currRow);
        }
        return ans; 
        /*List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;
		for (int i = 0; i < numRows; i++) {  //THIS IS SECOND ONE 
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++)
				if (j == 0 || j == i)
					row.add(1);
				else
					row.add(pre.get(j - 1) + pre.get(j));
			pre = row;
			res.add(row);
		}
		return res;*/
    }
}