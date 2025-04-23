class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int curr=0, n = intervals.length;
        ArrayList<int[]> ans = new ArrayList<int[]>();

        while(curr < n && intervals[curr][1] < newInterval[0]) {
            ans.add(intervals[curr]);
            curr++;
        }

        while(curr < n &&  newInterval[1] >= intervals[curr][0]) {
            newInterval[0] = Math.min(intervals[curr][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[curr][1], newInterval[1]);
            curr++;
        }
        ans.add(newInterval);

        while(curr < n) {
            ans.add(intervals[curr]);
            curr++;
        }

        return ans.toArray(new int[ans.size()][]);

    }
}