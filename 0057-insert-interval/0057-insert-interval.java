public class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length, i = 0;
        List<int[]> res = new ArrayList<>();
        
        while(i<n &&  intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        while(i<n && newInterval[1] >= intervals[i][0]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
         res.add(newInterval);

        while(i<n){
            res.add(intervals[i]);
            i++;
        }
        
        return res.toArray(new int[res.size()][]);
    }
}