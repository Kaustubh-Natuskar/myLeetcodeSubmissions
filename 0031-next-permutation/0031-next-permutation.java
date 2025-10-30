class Solution {
    public void nextPermutation(int[] nums) {
        int length = nums.length;
        int pivot = length-2;

        while(pivot >= 0){
            if(nums[pivot] < nums[pivot+1]) {
                break;
            }
            pivot--;
        }

        if(pivot >= 0) {
            for(int i=length-1; i>pivot; i--) {
                if(nums[i] > nums[pivot]) {
                    swap(pivot, i, nums);
                    break;
                }
            }
        }

        reverse(pivot+1, length-1, nums);
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int i, int j, int[] nums) {
        while(i<=j) {
            swap(i, j, nums);
            i++;
            j--;
        }
    }
}