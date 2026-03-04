class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> ans = new ArrayList<int[]>();
        ans.add(intervals[0]);

        for(int i=1; i<intervals.length; i++) {
            int[] lastInterval = ans.get(ans.size() - 1);
            int[] curr = intervals[i];

            if(curr[0] <= lastInterval[1]) {
                lastInterval[1] = Math.max(lastInterval[1], curr[1]);
            } else {
                ans.add(curr);
            }

        }

        return ans.toArray(new int[ans.size()][]);

    }
}