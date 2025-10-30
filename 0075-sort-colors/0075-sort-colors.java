class Solution {
    public void sortColors(int[] nums) {
        int i=-1, j=nums.length, k=0;
        while(k<j) {
            switch (nums[k]) {
                case 0:
                    i++;
                    swap(i, k, nums);
                    k++;
                break;
                    
                case 1:
                    k++;
                break;

                case 2:
                    j--;
                    swap(j, k, nums);
                break;
            }
        }
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}