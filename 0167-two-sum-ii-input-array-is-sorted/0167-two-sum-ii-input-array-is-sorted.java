class Solution {
    public int[] twoSum(int[] num, int target) {
        int i=0, j=num.length-1;
        int[] ans = new int[2];
        while(i<j){
            if(num[i] + num[j] == target){
                ans[0] = i+1;
                ans[1] = j+1;
                break;
            }
            if(num[i] + num[j] > target){
                j--;
            } else {
                i++;
            }
        }
        return ans;
    }
}