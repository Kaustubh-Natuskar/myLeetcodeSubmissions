class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> ans = new ArrayList<int[]>();
        ans.add(intervals[0]);

        for(int i=1; i<intervals.length; i++) {
            int[] curr = intervals[i];
            int[] last = ans.get(ans.size()-1);

            if(curr[0] <= last[1]) { //merging
                last[1] = Math.max(curr[1], last[1]);
            } else {
                ans.add(curr);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}