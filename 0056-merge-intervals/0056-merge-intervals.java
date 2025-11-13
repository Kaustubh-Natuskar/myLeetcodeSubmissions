class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> ans = new ArrayList<int[]>();
        ans.add(intervals[0]);
        for(int i=1; i<intervals.length; i++) {
            int[] last = ans.get(ans.size()-1);
            int[] curr = intervals[i];

            if(curr[0] <= last[1]) {
                last[1] = Math.max(last[1], curr[1]);
            } else {
                ans.add(intervals[i]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}