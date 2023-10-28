class Solution {
    public int[] twoSum(int[] num, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = num.length-1;

        while(i < j) {
            int sum = num[i] + num[j];
            if(sum == target){
                result[0] = i+1;
                result[1] = j+1;
                break;
            }
            if(sum > target) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }
}