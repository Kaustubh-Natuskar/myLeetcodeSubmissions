class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        //first rotate everything
        int i=0, j=nums.length-1;
        while(i<=j){
            swap(nums, i, j);
            i++;
            j--;
        }

        //rotate first k
        i = 0;
        j = k-1;
        while(i<=j){
            swap(nums, i, j);
            i++;
            j--;
        }

        //rotate last k to n-1
        i = k;
        j = nums.length-1;
        while(i<=j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}